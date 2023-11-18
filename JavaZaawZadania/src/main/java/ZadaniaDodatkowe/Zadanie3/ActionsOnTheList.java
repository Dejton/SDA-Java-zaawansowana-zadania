package ZadaniaDodatkowe.Zadanie3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ActionsOnTheList {
    public static List<Product> getComputerWithPriceBiggerThan5k(List<Product> input) {
        return input.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("computer") && product.getPrice() > 5000)
                .toList();
    }

    public static List<Product> getComputersAndChangePriceWithRabat(List<Product> input) {
        return input.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("computer"))
                .peek(e -> e.setPrice(e.getPrice() - (e.getPrice() * 0.2)))
                .toList();
    }

    public static Product getCheapestComputer(List<Product> input) {
        return input.stream()
                .filter(e -> e.getCategory().equalsIgnoreCase("computer"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .get();
    }

    public static List<Order> getOrderListsWithBooks(List<Order> input) {
        return input.stream()
                .filter(e -> e.getProductList().stream().anyMatch(product -> product.getCategory().equalsIgnoreCase("book")))
                .toList();
    }

    public static List<Product> getProductsWithSpecialDate(List<Order> input) {
        return input.stream()
                .filter(e -> e.getOrderDate().isBefore(LocalDate.of(2022, 2, 1)) && e.getOrderDate().isAfter(LocalDate.of(2022,1,1)))
                .flatMap(e -> e.getProductList().stream())
                .toList();
    }

    public static List<Order> lastOrders(List<Order> input) {
        return input.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(2)
                .toList();
    }

    public static double finalResultFromLastOrder(List<Order> input) {
        return input.stream()
                .sorted(Comparator.comparing(Order::getOrderDate))
                .limit(1)
                .flatMap(e -> e.getProductList().stream())
                .mapToDouble(Product::getPrice)
                .sum();
    }
}

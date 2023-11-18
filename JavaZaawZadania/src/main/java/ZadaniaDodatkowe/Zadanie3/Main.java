package ZadaniaDodatkowe.Zadanie3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Order> orderListOne = new ArrayList<>();
        List<Order> orderListTwo = new ArrayList<>();
        List<Order> orderListThree = new ArrayList<>();
        List<Order> orderListFour = new ArrayList<>();

        Product lenovo = new Product(123L, "Lenovo laptop", "Computer", 5500.0);
        Product hp = new Product(345L, "HP komputer stacjonarny", "Computer", 7000.0);
        Product acer = new Product(567L, "Acer laptop", "Computer", 3400.0);
        Product bajka = new Product(1362L, "Bajka dla dzieci", "Book", 45.0);
        Product dokument = new Product(6789L, "Książka popularno naukowa", "Book", 56.0);
        Product horror = new Product(3985L, "Książka horror", "Book", 24.5);

        Order productsListOne = new Order(666L, LocalDate.of(2022,2, 1), new ArrayList<>());
        Order productsListTwo = new Order(555L, LocalDate.of(2022, 1, 20), new ArrayList<>());
        Order productsListThree = new Order(444L, LocalDate.of(2022, 3, 19), new ArrayList<>());


        productsListOne.getProductList().add(lenovo);
        productsListOne.getProductList().add(hp);
        productsListOne.getProductList().add(acer);
        productsListOne.getProductList().add(bajka);
        productsListOne.getProductList().add(dokument);
        productsListOne.getProductList().add(horror);

        productsListTwo.getProductList().add(lenovo);
        productsListTwo.getProductList().add(hp);
        productsListTwo.getProductList().add(acer);

        productsListThree.getProductList().add(bajka);
        productsListThree.getProductList().add(dokument);
        productsListThree.getProductList().add(horror);

        orderListOne.add(productsListOne);

        orderListTwo.add(productsListTwo);
        orderListTwo.add(productsListThree);

        orderListThree.add(productsListThree);

        orderListFour.add(productsListOne);
        orderListFour.add(productsListTwo);
        orderListFour.add(productsListThree);



//        System.out.println(ActionsOnTheList.getComputerWithPriceBiggerThan5k(orderListOne.getProductList()));
//        System.out.println(ActionsOnTheList.getComputersAndChangePriceWithRabat(orderListOne.getProductList()));
//        System.out.println(ActionsOnTheList.getCheapestComputer(productsListOne.getProductList()));
//        System.out.println(ActionsOnTheList.getOrderListsWithBooks(orderListFour));
//        System.out.println(ActionsOnTheList.getProductsWithSpecialDate(orderListFour));
//        System.out.println(ActionsOnTheList.lastOrders(orderListFour));
        System.out.println(ActionsOnTheList.finalResultFromLastOrder(orderListFour));
    }
}

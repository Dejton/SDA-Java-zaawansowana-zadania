package ZadaniaDodatkowe.Zadanie3;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private final Long id;
    private final LocalDate orderDate;
    private List<Product> productList;

    public Order(Long id, LocalDate orderDate, List<Product> productList) {
        this.id = id;
        this.orderDate = orderDate;
        this.productList = productList;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Data zamówienia: %tF", id, orderDate);
    }
}

package Zadanie24;

public class Basket {
    private int totalItems;

    public Basket() {
        totalItems = 0;
    }
    public void addToBasket() {
        if (totalItems == 10) {
            throw new BasketFullException("Too many items in the basket");
        }
        totalItems++;
    }
    public void removeFromBasket() throws BasketEmptyException {
        if (totalItems == 0) {
            throw new BasketEmptyException("Can't remove from empty basket");
        }
        totalItems--;
    }
}

package Zadanie18_19;

public class Main {
    public static void main(String[] args) {
        Computer hp = new Computer("2.1GHz", "16Gb", "GTX", "HP", "Pavulon");
        Computer lenovo = new Computer("1.6GHz", "8Gb", "GTX", "Lenovo", "Idea Pad");
        Computer acer = new Computer("2.0GHz", "6Gb", "GTX@", "Acer", "Aspire");
        Computer hp2 = new Laptop("2.1GHz", "16Gb", "GTX", "HP", "Pavulon2", "Power Battery");

        System.out.println(hp.equals(lenovo));
        System.out.println(acer.toString());
        System.out.println(acer.hashCode());

    }
}

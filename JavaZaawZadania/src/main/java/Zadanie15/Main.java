package Zadanie15;

public class Main {
    public static void main(String[] args) {
        Car porsche = Car.PORSCHE;
        Car bmw = Car.BMW;
//        System.out.println(bmw.isPremium());
//        System.out.println(bmw.isRegular());

        System.out.println(porsche.isFasterThan(bmw));
    }


}

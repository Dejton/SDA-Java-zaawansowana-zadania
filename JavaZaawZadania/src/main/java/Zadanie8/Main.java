package Zadanie8;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(200,35,35,14.3f,true);

        System.out.println(new ParcelValidator().validate(parcel));

    }
}

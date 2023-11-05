package Zadanie17;

public class Main {
    public static void main(String[] args) {
        MeasurementConverter converter1 = new MeasurementConverter();

        System.out.println(converter1.convert(5, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(converter1.convert(10, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println(converter1.convert(40, ConversionType.METERS_TO_YARDS));
        System.out.println(converter1.convert(35, ConversionType.YARDS_TO_METERS));
        System.out.println(converter1.convert(30, ConversionType.KILOMETERS_TO_MILES));
        System.out.println(converter1.convert(25, ConversionType.MILES_TO_KILOMETERS));

        System.out.println(MeasurementConverter.convert(5,ConversionTypeWithFunction.CENTIMETERS_TO_INCHES));
    }
}

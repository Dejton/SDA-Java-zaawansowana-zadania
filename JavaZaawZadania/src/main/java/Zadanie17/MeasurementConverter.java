package Zadanie17;

public class MeasurementConverter {
    public double convert(int value, ConversionType conversionType) {
        return value * conversionType.getConverter();
    }

    public static double convert(double value, ConversionTypeWithFunction conversionType) {
        return conversionType.getConverter().apply(value);
    }
}

package Zadanie8;

public class ParcelValidator implements Validator{

    private static final int SINGLE_MIN_LENGTH = 30;
    private static final int SINGLE_MAX_LENGTH = 300;
    private static final int SINGLE_WEIGHT_FOR_NONE_EXPERT = 30;
    private static final int SINGLE_WEIGHT_FOR_EXPERT = 15;

    @Override
    public boolean validate(Parcel input) {
        if (isXYZLessThan300(input)) {
            System.out.println("Paczka za duża!");
            return  false;
        } else if (isAllDimensionsAreMoreThan30AndLessThan300(input)) {
            System.out.println("Nie prawidłowe wymiary!");
            return  false;
        } else if (isCorrectWeight(input)) {
            System.out.println("Paczka za ciężka!");
            return  false;
        }
        return  true;
    }

    private static boolean isCorrectWeight(Parcel input) {
        return (input.getWeight() > SINGLE_WEIGHT_FOR_NONE_EXPERT && !input.isExpress())
                || (input.getWeight() > SINGLE_WEIGHT_FOR_EXPERT && input.isExpress())
                || input.getWeight() == 0;
    }

    private static boolean isXYZLessThan300(Parcel input) {
        return input.getxLength() + input.getyLength() + input.getzLength() > 300;
    }

    private static boolean isAllDimensionsAreMoreThan30AndLessThan300(Parcel input) {
        return (input.getxLength() < SINGLE_MIN_LENGTH || input.getxLength() > SINGLE_MAX_LENGTH)
                || (input.getyLength() < SINGLE_MIN_LENGTH || input.getyLength() > SINGLE_MAX_LENGTH)
                || (input.getzLength() < SINGLE_MIN_LENGTH || input.getzLength() > SINGLE_MAX_LENGTH);
    }
}

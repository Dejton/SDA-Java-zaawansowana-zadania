package Zadanie27;

public class Main {
    public static void main(String[] args) {
        Joiner<String> joiner = new Joiner<>("-");

        String resultOne = joiner.join("abc", "def", "xyz");
        System.out.println(resultOne);



        Joiner<Integer> joinerTwo = new Joiner<>("|");

        String resultTwo = joinerTwo.join(1, 2, 3);
        System.out.println(resultTwo);

        Joiner<Boolean> joinerThree = new Joiner<>("*");

        String resultThree = joinerThree.join(true, false, true);
        System.out.println(resultThree);
    }
}

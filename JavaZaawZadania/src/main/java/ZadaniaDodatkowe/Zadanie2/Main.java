package ZadaniaDodatkowe.Zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Programmer> listOfProgrammers = new ArrayList<>();
        Programmer andrzej = new Programmer(new ArrayList<>(), new Person("Andrzej", "Kowalski", "male", 34));
        Programmer kasia = new Programmer(new ArrayList<>(), new Person("Katarzyna", "Skoczykłoda", "female", 24));
        Programmer karol = new Programmer(new ArrayList<>(), new Person("Karol", "Nowak", "male", 40));
        Programmer krystian = new Programmer(new ArrayList<>(), new Person("Krystian", "Kornacki", "male", 16));
        Programmer krysia = new Programmer(new ArrayList<>(), new Person("Krystyna", "Czubówna", "female", 17));
        Programmer agnieszka = new Programmer(new ArrayList<>(), new Person("Agnieszka", "Turek", "female", 20));
        Programmer basia = new Programmer(new ArrayList<>(), new Person("Barbara", "Rakoczy", "female", 28));

        listOfProgrammers.add(andrzej);
        listOfProgrammers.add(kasia);
        listOfProgrammers.add(karol);
        listOfProgrammers.add(krystian);
        listOfProgrammers.add(krysia);
        listOfProgrammers.add(agnieszka);
        listOfProgrammers.add(basia);

        andrzej.getListOfProgrammingLanguages().add("java");
        andrzej.getListOfProgrammingLanguages().add("python");
        kasia.getListOfProgrammingLanguages().add("java");
        karol.getListOfProgrammingLanguages().add("python");
        krystian.getListOfProgrammingLanguages().add("c++");
        krystian.getListOfProgrammingLanguages().add("java");
        krystian.getListOfProgrammingLanguages().add("python");
        krysia.getListOfProgrammingLanguages().add("java");
        krysia.getListOfProgrammingLanguages().add("c#");
        krysia.getListOfProgrammingLanguages().add("python");
        agnieszka.getListOfProgrammingLanguages().add("c#");


//        List<Programmer> males = Programmer.getMales(listOfProgrammers);
//        System.out.println(males);

//        List<Programmer> javaUnderageProgrammers = Programmer.getJavaUnderageProgrammers(listOfProgrammers);
//        System.out.println(javaUnderageProgrammers);

//        List<Programmer> programmersWithTwoOrMoreLanguages = Programmer.getProgrammersWithTwoOrMoreLanguages(listOfProgrammers);
//        System.out.println(programmersWithTwoOrMoreLanguages);

//        List<Programmer> femaleJavaProgrammers = Programmer.getFemaleJavaProgrammers(listOfProgrammers);
//        System.out.println(femaleJavaProgrammers);

//        List<String> maleNames = Programmer.getMaleNames(listOfProgrammers);
//        System.out.println(maleNames);
//
//        Set<String> allProgrammingLanguages = Programmer.getAllProgrammingLanguages(listOfProgrammers);
//        System.out.println(allProgrammingLanguages);

//        List<String> lastNames = Programmer.getLastNames(listOfProgrammers);
//        System.out.println(lastNames);

//        boolean anyoneWithoutLanguage = Programmer.isAnyoneWithoutLanguage(listOfProgrammers);
//        System.out.println(anyoneWithoutLanguage);

//        int numberOfLanguages = Programmer.getNumberOfLanguages(listOfProgrammers);
//        System.out.println(numberOfLanguages);
//
        boolean anyoneWithoutLanguage = Programmer.isAnyoneWithoutLanguage(listOfProgrammers);
        System.out.println(anyoneWithoutLanguage);
    }
}

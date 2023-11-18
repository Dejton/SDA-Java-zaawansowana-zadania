package ZadaniaDodatkowe.Zadanie2;

import java.util.*;
import java.util.stream.Collectors;

public class Programmer {
    private List<String> listOfProgrammingLanguages = new ArrayList<>();
    private final Person person;

    public Programmer(List<String> listOfProgrammingLanguages, Person person) {
        this.listOfProgrammingLanguages = listOfProgrammingLanguages;
        this.person = person;
    }

    public List<String> getListOfProgrammingLanguages() {
        return listOfProgrammingLanguages;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(listOfProgrammingLanguages, that.listOfProgrammingLanguages) && Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfProgrammingLanguages, person);
    }

    @Override
    public String toString() {
        return person.getName();
    }

    public static List<Programmer> getMales(List<Programmer> listOfProgrammers) {
        return listOfProgrammers.stream()
                .filter(e -> e.getPerson().getSex().equalsIgnoreCase("male"))
                .toList();
    }

    public static List<Programmer> getJavaUnderageProgrammers(List<Programmer> listOfProgrammers) {
        return listOfProgrammers.stream()
                .filter(e -> e.getListOfProgrammingLanguages().contains("java"))
                .filter(e -> e.getPerson().getAge() < 18)
                .toList();
    }

    public static List<Programmer> getProgrammersWithTwoOrMoreLanguages(List<Programmer> listOfProgrammers) {
        return listOfProgrammers.stream()
                .filter(e -> e.getListOfProgrammingLanguages().size() > 1)
                .toList();
    }

    public static List<Programmer> getFemaleJavaProgrammers(List<Programmer> listOfProgrammers) {
        return listOfProgrammers.stream()
                .filter(e -> e.getPerson().getSex().equalsIgnoreCase("female"))
                .filter(e -> e.getListOfProgrammingLanguages().contains("java") && e.getListOfProgrammingLanguages().contains("c#"))
                .toList();
    }

    public static List<String> getMaleNames(List<Programmer> listOfProgrammers) {
        return listOfProgrammers.stream()
                .filter(e -> e.getPerson().getSex().equalsIgnoreCase("male"))
                .map(e -> e.getPerson().getName())
                .toList();
    }

    public static Set<String> getAllProgrammingLanguages(List<Programmer> listOfProgrammers) {
        return listOfProgrammers.stream()
                .flatMap(e -> e.getListOfProgrammingLanguages().stream())
                .collect(Collectors.toSet());
    }

    public static List<String> getLastNames(List<Programmer> listOfProgrammers) {
        return listOfProgrammers.stream()
                .filter(e -> e.getListOfProgrammingLanguages().size() > 2)
                .map(e -> e.getPerson().getLastName())
                .toList();
    }

    public static boolean isAnyoneWithoutLanguage(List<Programmer> listOfProgrammers) {
        return listOfProgrammers.stream()
                .anyMatch(e -> e.getListOfProgrammingLanguages().isEmpty());


//                .findAny(e -> e.getListOfProgrammingLanguages().isEmpty() ?  true :  false);
    }

    public static int getNumberOfLanguages(List<Programmer> listOfProgrammers) {
        return (listOfProgrammers.stream()
                .filter(e -> e.getPerson().getSex().equalsIgnoreCase("female"))
                .flatMap(e -> e.getListOfProgrammingLanguages().stream())
                .collect(Collectors.toSet())).size();
    }
}

package Zadanie30;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static final String DIR_PATH = "src/main/java/Zadanie30";
    public static final String INPUT_FILE_NAME = "zadanie.nowe.csv";

    public static void main(String[] args) throws IOException {
        /*
       1. getFileContent
       2. reverseFileContent
       3. reverseFileName
       4.  saveFile
        */

        Path dirPath = Path.of(DIR_PATH);
        Path inputFile = dirPath.resolve(INPUT_FILE_NAME);
        if (!inputFile.toFile().exists()) {
            System.out.println("Plik nie istnieje!");
            return;
        }
        List<String> fileContent = getFileContent(inputFile);
        System.out.println("input: " + fileContent);

        List<String> reverseContent = reverseFileContent(fileContent);
        System.out.println("input: " + reverseContent);

        Path outputFile = reverseFileName(inputFile);
        System.out.println(outputFile.toFile().getName());

        saveFile(outputFile, reverseContent);
    }

    private static List<String> getFileContent(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile);
    }

    private static List<String> reverseFileContent(List<String> content) {
        return content.stream()
                .map(e -> new StringBuilder(e).reverse().toString())
                .toList();
    }

    private static Path reverseFileName(Path inputFile) {
        String fileName = inputFile.toFile().getName();

        String fileExtension = "";

        int index = fileName.lastIndexOf(".");

        if (index > 0) {
            fileExtension = fileName.substring(index);
            fileName = fileName.substring(0, index);
        }
        String outputFileName = new StringBuilder(fileName)
                .reverse()
                .append(fileExtension)
                .toString();
        return inputFile.getParent().resolve(outputFileName);
    }

    private static void saveFile(Path outputFile, List<String> content) throws IOException {
        Files.write(outputFile, content, StandardCharsets.UTF_8);
    }
}

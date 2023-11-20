package NBP;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws MalformedURLException, JsonProcessingException {
        URL nbp = new URL("http://api.nbp.pl/api/exchangerates/tables/b/?format=json");
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(nbp.openConnection().getInputStream()))) {
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                result.append(inputLine);
            }
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ObjectMapper om = new ObjectMapper();
        Root root = om.readValue(result.toString(), Root[].class)[0];
    }
}

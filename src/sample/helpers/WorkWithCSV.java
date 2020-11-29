package sample.helpers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkWithCSV {

    public List giveAllWords(String filename) {
        List<String> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line);
            }
            return records;
        } catch (IOException e) {
            e.printStackTrace();
            return records;
        }
    }

}

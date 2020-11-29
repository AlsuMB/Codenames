package sample.helpers;

import sun.awt.windows.WPrinterJob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomCards {
    public List give25Cards() {
        WorkWithCSV workWithCSV = new WorkWithCSV();
        List<String> allWords = workWithCSV.giveAllWords("src/sample/templates/words.csv");
        List<Integer> numbers = randomNumbers(allWords.size());
        ArrayList<String> res = new ArrayList<>();
        for (int element : numbers) {
            res.add(allWords.get(element));
        }
        return res;
    }

    public ArrayList<Integer> randomNumbers(int maxSize) {
        int i = 0;
        Set<Integer> setNumber = new HashSet<>();
        while (i != 25) {
            int random = (int) (Math.random() * (maxSize));

            if (!setNumber.contains(random)) {
                setNumber.add(random);
                i++;
            }
        }
        return new ArrayList<>(setNumber);
    }

    public static void main(String[] args) {
        RandomCards randomCards = new RandomCards();
        System.out.println(randomCards.give25Cards());
    }
}

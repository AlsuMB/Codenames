package sample.helpers;

import sample.models.CardsColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// +1 синекрасный, +1 черный, 8 красных, 8 синих, 7 белых
public class RandomColors {
    public List<CardsColor> randomColors() {
        double whoFirst = Math.random();
        CardsColor more = CardsColor.BLUE;
        CardsColor less = CardsColor.RED;
        if (whoFirst > 0.5) {
            more = CardsColor.RED;
            less = CardsColor.BLUE;
        }
        ArrayList<CardsColor> randomizeColor = new ArrayList<>();
        int[] countRemaining = new int[]{9, 8, 7, 1};
        int i = 0;
        while (i < 25) {
            int randomNumber = (int) (Math.random() * 26);

            if (randomNumber < 10 && countRemaining[0] > 0) {
                countRemaining[0] -= 1;
                randomizeColor.add(more);
                i++;
            } else if (randomNumber < 18 && countRemaining[1] > 0) {
                countRemaining[1] -= 1;
                randomizeColor.add(less);
                i++;
            } else if (randomNumber < 25 && countRemaining[2] > 0) {
                countRemaining[2] -= 1;
                randomizeColor.add(CardsColor.WHITE);
                i++;
            } else if (randomNumber == 25 && countRemaining[3] > 0) {
                countRemaining[3] -= 1;
                randomizeColor.add(CardsColor.BLACK);
                i++;
            }
        }
        return randomizeColor;
    }

    public static void main(String[] args) {
        RandomColors randomCards = new RandomColors();
        System.out.println(randomCards.randomColors());
    }
}

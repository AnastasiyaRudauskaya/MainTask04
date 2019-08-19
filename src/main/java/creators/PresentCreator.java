package creators;

import entity.Candy;
import entity.CandyList;
import entity.NewYearPresent;

import java.util.ArrayList;
import java.util.Random;


public class PresentCreator {
    private static final int NUMBER_OF_CANDIES = 20;

    public static ArrayList<Candy> createPresent(ArrayList<Candy> list) {
        ArrayList<Candy> present = new ArrayList<Candy>();
        Random random = new Random();
        int length = list.size();

        for (int i = 0; i < NUMBER_OF_CANDIES; i++) {
            present.add(list.get(random.nextInt(length)));
        }
        return present;
    }
}

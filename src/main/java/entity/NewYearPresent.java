package entity;

import creators.PresentCreator;

import java.util.ArrayList;

public class NewYearPresent {
    public ArrayList<Candy> present;
    private double weight = 0;

    public NewYearPresent(ArrayList<Candy> list) {
        present = PresentCreator.createPresent(list);
        for (Candy candy : present
        ) {
            weight += candy.getWeight();
        }

    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<Candy> getPresent() {
        return present;
    }


    public void show() {
        for (Candy candy : present
        ) {
            System.out.println(candy.toString());
        }
    }

}

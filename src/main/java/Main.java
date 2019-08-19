import action.SortCandiesInPresent;
import entity.CandyList;
import entity.NewYearPresent;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        CandyList candyList;
        try {
            candyList = new CandyList( new File("src\\input.txt"));
        }
        catch (FileNotFoundException ex){
            System.out.println("Incorrect file path.");
            return;
        }
        NewYearPresent present = new NewYearPresent(candyList.getCandyList());
        present.show();

        System.out.println("The weight of present: "+present.getWeight());

        SortCandiesInPresent.sortByWeight(present);
        present.show();


    }
}
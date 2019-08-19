package action;

import entity.Candy;
import entity.NewYearPresent;

import java.util.Comparator;

public class SortCandiesInPresent {
    public static void sortByWeight(NewYearPresent present){
        present.getPresent().sort(new Comparator<Candy>() {
            @Override
            public int compare(Candy candy1,Candy candy2) {
                if(candy1.getWeight() >candy2.getWeight()) {
                    return 1;
                }else if (candy1.getWeight() <candy2.getWeight()){
                    return -1;
                } else return 0;
            }
        });
    }

    public static void sortByEnergyValue(NewYearPresent present){
        present.getPresent().sort(new Comparator<Candy>() {
            @Override
            public int compare(Candy candy1,Candy candy2) {
                if(candy1.getEnergyValue() >candy2.getEnergyValue()) {
                    return 1;
                }else if (candy1.getEnergyValue() <candy2.getEnergyValue()){
                    return -1;
                } else return 0;
            }
        });
    }

    public static void sortBySugarContent(NewYearPresent present){
        present.getPresent().sort(new Comparator<Candy>() {
            @Override
            public int compare(Candy candy1,Candy candy2) {
                if(candy1.getSugarContent() >candy2.getSugarContent()) {
                    return 1;
                }else if (candy1.getSugarContent() <candy2.getSugarContent()){
                    return -1;
                } else return 0;
            }
        });
    }
}

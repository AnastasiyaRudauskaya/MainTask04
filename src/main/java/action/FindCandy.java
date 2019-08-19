package action;

import entity.Candy;
import entity.NewYearPresent;

public class FindCandy {
    public int findCandy(Candy candy, NewYearPresent present) {
        int count = 0;
        for (Candy a : present.getPresent()) {
            if (a.equals(candy))
                count++;
        }
        return count;
    }
}

package creators;

import entity.Candy;
import entity.CaramelCandy;
import entity.ChocolateCandy;
import entity.JellyCandy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CandyListCreator {
    public static ArrayList<Candy> createCandyList(File file) throws FileNotFoundException {
        ArrayList<Candy> list =new ArrayList<Candy>();
        Scanner sc = new Scanner(file);
        String type;
        String name;
        double energyValue;
        double sugarContent;
        double weight;
        double percentageOfCocoa;
        while (sc.hasNext()){
            percentageOfCocoa=-1;
            type = sc.next();
            name = sc.next();
            energyValue = sc.nextDouble();
            sugarContent = sc.nextDouble();
            weight= sc.nextDouble();
            if (type.equals("CHOCOLATE")){
                percentageOfCocoa = sc.nextDouble();
            }
            if (validateCandy(type,name,energyValue,sugarContent,weight,percentageOfCocoa)){
                list.add(getCandy(type,name,energyValue, sugarContent,
                        weight,percentageOfCocoa));

            }

        }
        return list;
    }

    public static boolean validateCandy(String type,String name,double energyValue,
                                        double sugarContent, double weight,double percentageOfCocoa){
        if (!type.equals("CHOCOLATE")&&!type.equals("CARAMEL")&&!type.equals("JELLY")) {
            return false;
        }

        if (type.equals("CHOCOLATE")&&(percentageOfCocoa<0||percentageOfCocoa>98)){
            return false;
        }

        if (energyValue<700&&energyValue>10&&sugarContent>=0
                &&sugarContent<100&&weight>0&&weight<150){
            return true;
        } else {
            return false;
        }

    }

    public static Candy getCandy(String type, String name,double energyValue,
                                 double sugarContent, double weight,double percentageOfCocoa){
        Candy toReturn = null;
        if(type.equals("CARAMEL")){
                toReturn=new CaramelCandy(name,energyValue,sugarContent,weight);
        }else if (type.equals("JELLY")){
            toReturn = new JellyCandy(name,energyValue,sugarContent,weight);
        }else{
            toReturn = new ChocolateCandy(name,energyValue,sugarContent,weight,
                    percentageOfCocoa);
        }
        return toReturn;
    }
}

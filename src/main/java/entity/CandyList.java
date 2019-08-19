package entity;

import creators.CandyListCreator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CandyList {
   private ArrayList<Candy> database;

    public CandyList(File file)throws FileNotFoundException{
       database= CandyListCreator.createCandyList(file);
    }

    public ArrayList<Candy> getCandyList() {
        return database;
    }


    public void show(){
        for (Candy candy: database
        ) {
            System.out.println(candy.toString());
        }
    }
}

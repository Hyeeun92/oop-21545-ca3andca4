package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Listing BlackWidow = new Listing("Black Widow","Cate Shortland","07/05/2021", "130 mins","Watch");
        Listing PeterRabbit2 = new Listing("Peter Rabbit 2","Will Gluck","21/05/2021","92 mins","");

        BlackWidow.saveInFile();
        PeterRabbit2.saveInFile();

        BlackWidow.readFromFile();
        PeterRabbit2.saveInFile();

        System.out.println(BlackWidow.toString());
        System.out.println(PeterRabbit2.toString());


    }
}

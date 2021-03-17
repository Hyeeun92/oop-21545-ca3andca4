package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Listing extends Movie implements Inter {

    public Listing (String title, String director, String release, String runTime, String action) {
        this.title = title;
        this.director = director;
        this.release = release;
        this.runTime = runTime;
        setAction(action);
    }

    // Feature: Overriding toString()
    @Override
    public String toString() {
        return String.format("Title : %s / Director :  %s / Release : %s / Running time : %s / Watched : %s", title, director, release, runTime, getAction());
    }

    // Feature: Writing to a file
    @Override
    public void saveInFile() {
        try {
            FileWriter fw = new FileWriter("MovieTracker.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bf);
            pw.print(title + "," + director + "," + release + "," + runTime + "," + getAction() + "\n");
            pw.close();
        } catch (IOException e) {

        }
    }

    // Feature: Reading from a file
    @Override
    public void readFromFile() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("MovieTracker.txt"));
        String line = null;

        // Feature: Collection - Queue
        Queue<String> movieList = new LinkedList();

        while ((line = br.readLine()) != null) {

            String[] movieData = line.split(",");

            movieList.add(movieData[0]);
            movieList.add(movieData[1]);
            movieList.add(movieData[2]);
            movieList.add(movieData[3]);
            movieList.add(movieData[4]);

            break;

        }

    }


}

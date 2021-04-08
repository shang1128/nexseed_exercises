package com.nexseed_exercises;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //3 methods with user input for data and print it randomly
        Scanner sc = new Scanner(System.in);
        GIrls[] gnames = new GIrls[3];      //putting an array to a class
        Boys[] bnames = new Boys[3];
        Relation[] relate = new Relation[3];


        for (int i = 0; i < gnames.length; i++) {
            System.out.println("Enter three Girl's name");
            String name = sc.nextLine();
            gnames[i] = new GIrls();
            gnames[i].setGname(name);
        }

        for (int i = 0; i < bnames.length; i++) {
            System.out.println("Enter three Boy's name");
            String name = sc.nextLine();
            bnames[i] = new Boys();
            bnames[i].setBname(name);
        }
        for (int i = 0; i < relate.length; i++) {
            System.out.println("Enter three relationship");
            String relation = sc.nextLine();
            relate[i] = new Relation();     //to shorten the code use the constructor relate[i] = new Relation(relation);
            relate[i].setRelation(relation);
        }
        int c=0;
        while (c<3) {
            System.out.println(gnames[Random()].getGname() +" "+relate[Random()].getRelation() +" " + bnames[Random()].getBname());
            c++;
        }
        }

    public static int Random(){
        Random r = new Random();
        return r.nextInt(3);
    }
  }

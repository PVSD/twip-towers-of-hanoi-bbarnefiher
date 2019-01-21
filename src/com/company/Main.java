package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Tower of Hanoi Game.\n" +
                "This program will solve this puzzle for you.\n" +
                "Please input number of disks to solve for:");
        Scanner intReader = new Scanner(System.in);
        int diskCount = intReader.nextInt();
        System.out.println("Instructions:");


            TowersOfHanoi.solve(diskCount, '1', '2', '3');



        System.out.println("\nThe game has ended.");
    }
}

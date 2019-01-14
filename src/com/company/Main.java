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
        TowersOfHanoi Towers = new TowersOfHanoi(diskCount);
        System.out.println("Instructions:");
        int totalTurns = (int)(Math.pow(2, diskCount) - 1);
        for (int i = 1; i < totalTurns + 1; i++) {

            System.out.println(i + ": " + Towers.solve() + ".");
        }

        System.out.println("The game has ended.");
    }
}

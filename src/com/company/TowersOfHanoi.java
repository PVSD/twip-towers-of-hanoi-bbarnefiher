package com.company;

/**
 * Created by bb222 on 1/14/19.
 */
public class TowersOfHanoi {
    static int turnCount = 0;

    public static void solve(int a, char fromTower, char temp, char toTower){

    //    System.out.println("check a");
        if (a == 1)
        {
            //System.out.println("check turn count");
            turnCount++;
            System.out.println(turnCount + ": Move one disk from tower " +  fromTower + " to " + toTower);
            return;
        }

      //  System.out.println("check b");
        solve(a - 1, fromTower, toTower, temp);
 //       System.out.println("a");
        turnCount++;
        System.out.println(turnCount + ": Move one disk from tower " +  fromTower + " to " + toTower);
        solve(a - 1, temp, fromTower, toTower);

    }

}

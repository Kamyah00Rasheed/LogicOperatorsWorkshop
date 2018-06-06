package com.company;

public class Main {

    public static void main(String[] args) {

        /*

        Relational Operators
        < - less than
        <= - less than OR equal to
        > - grater than
        >= grater than OR equal to
        == - equals
        != - not equal to

        Logical Operators
        && - AND
        || - OR
        ! - NOT

         */

        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a=2");
        System.out.println("b=4");
        System.out.println("x=6");
        System.out.println("y=1");

        //AND Operator
        if (a == x && y + y == a) {
            System.out.println("a==x && y+y==a");
        }
        //This method will not run because a does NOT equal x

        //NOT Operator
        if (!((a == x)) && y + y == a) {
            System.out.println("!(a==x) && y+y==a");
        }
        //This method will run because both conditions are met. By changing the first condition so it reads
        //a is not equal to x, then it considered true and both conditions are met

        //OR Operator
        if (a == x || y + y == a) {
            System.out.println("a==x || y+y==a");
        }
        //This method will run because it as an OR statement, and only one condition must be met

        //RELATIONSHIP

        //Less than
        if (a > b)
            System.out.println("This method will print because a is less than b.");

        //Less than or equal to
        if (a >= b)
            System.out.println("This method will print because a is less than (but not equal to) b.");

        //Greater than
        if (a < 6) {
            System.out.println("a is larger than 6.");
        }

        //Greater than or equal to
        if (b <= 6) {
            System.out.println("6 is larger than or equal to b.");
        }

        //Equal to
        if (x == 6) {
            System.out.println("I'm hungry.");
        } else {
            System.out.println("I'm full.");
        }

        //Not equal to
        if (y != 2) {
            System.out.println("Y is equal to 1!");
        }


    }

}



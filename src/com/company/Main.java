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
        if(a==x && y+y==a){
            System.out.println("a==x && y+y==a"); }
            //This method will not run because a does NOT equal x

        //NOT Operator
        if(!((a==x))&& y+y==a){
            System.out.println("!(a==x) && y+y==a"); }
        //This method will run because both conditions are met. By changing the first condition so it reads
        //a is not equal to x, then it considered true and both conditions are met

        //OR Operator
        if(a==x || y+y==a){
            System.out.println("a==x || y+y==a"); }
            //This method will run because it as an OR statement, and only one condition must be met
        }
    }


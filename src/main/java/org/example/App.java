/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static double roundMoney(double raw){
        return Math.round(raw*100)/100.0;
    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        double price1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int amt1 = input.nextInt();

        System.out.print("Enter the price of item 2: ");
        double price2 = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int amt2 = input.nextInt();

        System.out.print("Enter the price of item 3: ");
        double price3 = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int amt3 = input.nextInt();

        double subtotal = roundMoney(price1 * amt1 + price2 * amt2 + price3 * amt3);
        double tax = roundMoney(.055 * subtotal);
        double total = subtotal + tax;

        System.out.print("Subtotal: $"+ subtotal + "\nTax: $" + tax +
                "\n Total: $" + total);
    }
}

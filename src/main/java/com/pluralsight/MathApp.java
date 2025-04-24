package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
        //Finding the highest value from the two variables

         int bobSalary = 95000;
         int garySalary = 125000;

         int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The Highest Salary is " + highestSalary);

        ////////////////////////////////////////
        //Finding the lowest value from the two variables

        int carPrice = 35000;
        int truckPrice = 85000;

        int lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The Lowest price is " + lowestPrice);

        /////////////////////////////////////////
        //Finding the area of a circle radius

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius,2);

        System.out.println("The answer is " + radius + area);

        ////////////////////////////////////
        //Finding the square root of a number

        double number = 5;
        double squareRoot = Math.sqrt(number);

        System.out.println("The Square root is " + squareRoot);

        //////////////////////////////////////
        // finding and displaying the distance between points

        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double distance = Math.sqrt((Math.pow(x2 - x1,2))+ Math.pow(y2 - y1,2));
        System.out.println("The distance is " + distance);

        //////////////////////////////////////
        //Finding the absolute value of a number

        double numbers = -3.8;

        double absoluteValue = Math.abs(numbers);

        System.out.println("The Absolute Value Is " + absoluteValue);

        /////////////////////////////////////////
        //Finding a random number between a set of number

        double randomNumber = Math.random();

        System.out.println("Random Numbers Between 0 and 1 is " + randomNumber);







    }
}
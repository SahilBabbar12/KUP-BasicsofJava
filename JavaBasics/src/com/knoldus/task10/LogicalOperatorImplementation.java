package com.knoldus.task10;

public class LogicalOperatorImplementation {

    // Decision-making using LogicalOperators in "if else-if"

    public static void main(String[] args) {
        boolean isCold=true;
        boolean isRainy=false;

        if(isCold && isRainy)
        {
            System.out.println("Bring a jacket and an umbrella");
        }
        else if (isCold && !isRainy)
        {
            System.out.println("Bring a jacket");
        }
        else
            System.out.println("Bring an umbrella");

    }
}

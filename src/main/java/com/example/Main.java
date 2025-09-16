package com.example;

public class Main {
    public static void main(String[] args) {
        // Demonstrate the functionality of the calculator
        int a = 10;
        int b = 5;  
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }
   //methods for basic arithmetic operations
    public static int add(int a, int b) {
        return a + b;}
    public static int subtract(int a, int b) {
        return a - b;}
    public static int multiply(int a, int b) {
        return a * b;}
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed."); 
        }
        else {
            return a / b;
        }   
    }
    
}
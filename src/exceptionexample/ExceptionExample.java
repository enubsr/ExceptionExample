/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

import java.util.Scanner;

/**
 *
 * @author Enubs
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a number: ");
        try {
            num = Integer.parseInt(in.nextLine());
            int quotient = num / 0;
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid format for input.");
        }
    }
}

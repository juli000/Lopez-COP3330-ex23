/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        String curr = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key?");
        curr = s.nextLine();
        if(curr.equals("y")){
            System.out.println("Are the terminals corroded?");
            curr = s.nextLine();
            if(curr.equals("y")){
                System.out.println("Clean terminals and try starting again.");
                return;
            }
            else {
                System.out.println("Replace cables and try again.");
                return;
            }
        }
        else{
            System.out.println("Does the car make a slicking noice?");
            curr = s.nextLine();
            if(curr.equals("y")){
                System.out.println("Replace the battery");;
                return;
            }
            else{
                System.out.println("Does the car crank up but fail to start?");
                curr = s.nextLine();
                if(curr.equals("y")){
                    System.out.println("Check spark plug connections");
                    return;
                }
                else{
                    System.out.println("Does the engine start then die?");
                    curr = s.nextLine();
                    if(curr.equals("y")){
                        System.out.println("Does your car have fuel injection?");
                        curr = s.nextLine();
                        if(curr.equals("y")){
                            System.out.println("Get it in for service.");
                            return;
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                            return;
                        }

                    }
                    else{
                        System.out.println("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }
}

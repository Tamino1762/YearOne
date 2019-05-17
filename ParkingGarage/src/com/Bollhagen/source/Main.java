package com.Bollhagen.source;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //declare variables

        String choice; //for user input (use 1. enter, 2. exit, 3. close garage)
        Garage garage = new Garage();
        Scanner input = new Scanner(System.in);
        garage.readTicketFile();
        //make header
        System.out.println("Awesome Garage");
        System.out.println("--------------");

            //make an entrance menu (call Garage class)
            System.out.println("Would you like to \n1. Check In\n3. Close Garage");
            System.out.println("=>");
            choice = input.nextLine();

            switch (choice){
                case "1":
                    garage.enterCar();
                    break;
                case "3":
                    garage.closeGarage();
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        //make an exit menu (call Garage class)
        System.out.println("Awesome Garage");
        System.out.println("--------------");
        System.out.println("Would you like to \n1. Check Out\n2.Lost Ticket\n3. Close Garage");//make choices
        System.out.println("=>");
        choice = input.nextLine();
        switch (choice){
            case "1":
                garage.exitCar();
                break;
            case "2":
                garage.LostTicket();
                break;
            case "3":
                garage.closeGarage();
                break;
            default:
                System.out.println("Enter a valid option");
        }
    }
}

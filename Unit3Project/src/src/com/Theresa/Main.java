package com.Theresa;
/**
 * @author Theresa Bollhagen
 * Parking Garage v 2.0
 * Advanced Java Spring 2019
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

        String choice;
        Scanner input = new Scanner(System.in);
        TicketFactory ticketFactory = new TicketFactory();
        PaymentFactory paymentFactory = new PaymentFactory();
        ArrayList<Ticket> tickets = new ArrayList<>();
        Close close = Close.getInstance(); //total here (Singleton Call)
        Time time = new Time();
        Calculate calc = new Calculate();
        VehicleID vehicleID = new VehicleID();
        boolean closeChoice = false;
        int enterTime;
        int exitTime;
        int cost;
        int hours;
        //Close close;
        System.out.println("Awesome Garage");
        System.out.println("--------------");

        //make an entrance menu (call Garage class)
        System.out.println("Would you like to \n1. Check In\n2. Special Event\n3. Close Garage");
        System.out.println("=>");
        choice = input.nextLine();
        int v = vehicleID.getVehicleID();
        //entrance menu
        switch (choice){
            case "1":
            		tickets.add(ticketFactory.getTicketTypes(TicketTypes.HOURLY));
            		for (Ticket t : tickets){
            			time.setEnterTime();
            			enterTime = time.getEnterTime();
            			t.setEnterTime(enterTime);
            			t.setVehicleID(v);
            			t.displayInTicket();
            		}
                break;
            case "2":
            		tickets.add(ticketFactory.getTicketTypes(TicketTypes.SPECIALEVENT));
            		for (Ticket t : tickets){
            			t.setVehicleID(v);
            			t.displayInTicket();
            		}
                break;
            case "3":
                close.ReadFile();
                close.SumTotals();
                System.out.println("Garage Closed");
                closeChoice = true;
                break;
            default:
                System.out.println("Enter a valid option");
            }
        //Exit Menu if Garage is not closed
        if(!closeChoice) {
            // exit menu
        		System.out.println("Awesome Garage");
        		System.out.println("--------------");
        		System.out.println("Would you like to \n1. Check Out \n2. Lost Ticket");//make choices
        		System.out.println("=>");
        		choice = input.nextLine();
        		switch (choice){
        			case "1":
        				for (Ticket t : tickets){
        					String ticketType = t.getType();
        					if (ticketType == "Hourly") {
        						//set Exit time
        						time.setExitTime();
        						exitTime = time.getExitTime();
        						//calculate hours
        						time.setHours();
        						hours = time.getHours();
        						cost = calc.calculateCost(hours);
        						t.setExitTime(exitTime);
        						t.setCost(cost);
        						t.displayOutTicket();
        						//Add to file
        						close.addTicketToFile(cost+",0,0");
        					}else if (ticketType == "SpecialEvent"){
        						t.displayOutTicket();
        						int specialEvent = t.getCost();
        						close.addTicketToFile("0," + specialEvent + ",0");
        					}
        				}
        				break;
        			case "2":
        				tickets = new ArrayList<>();
        				tickets.add(ticketFactory.getTicketTypes(TicketTypes.LOST));
        				for (Ticket t : tickets){
        					if(t.getType() == "Lost") {
        						String ticketType = t.getType();
        						t.displayOutTicket();
        						int lost = t.getCost();
        						close.addTicketToFile("0,0," + lost);
        					}
        				}
                break;
            default:
                System.out.println("Enter a valid option");
        		}
        		 System.out.println("Enter payment method:\n 1. Cash\n 2. Credit/Debit");
        		 System.out.println("=>");
        		 String paymentMethod = input.nextLine();
        		 System.out.println("Awesome Garage");
        		 System.out.println("--------------");
        		 System.out.println("Receipt for vehicle ID: " + v);
        		 System.out.println();

        	     switch (paymentMethod) {
        	     	case "1":
        	     		Payment cash = paymentFactory.getPaymentType(PaymentType.CASH);
        	     		for (Ticket t : tickets){
        	     			if(t.getType() == "Hourly") {
        	     				if (t.getEnterTime() == 12) {
        	     					System.out.println(time.getHours() + " hours parked " + t.getEnterTime() + "pm " + "- " + t.getExitTime() + "pm");
        	     				} else {
        	     					System.out.println(time.getHours() + " hours parked " + t.getEnterTime() + "am " + "- " + t.getExitTime() + "pm");
        	     				}
        	     			}
        	     			System.out.println();
        	     			cash.displayPayment();
        	     			System.out.println();
        	     			System.out.println("\t\t\t\t$" + t.getCost() + ".00");
        	     		}
        	     		break;
        	     	case "2":
        	     		Payment card = paymentFactory.getPaymentType(PaymentType.CARD);
        	     		for (Ticket t : tickets){
        	     			if(t.getType() == "Hourly") {
        	     				if (t.getEnterTime() == 12) {
        	     					System.out.println(time.getHours() + " hours parked " + t.getEnterTime()  + "pm " + "- " + t.getExitTime() + "pm");
        	     				} else {
        	     					System.out.println(time.getHours() + " hours parked " + t.getEnterTime()  + "am " + "- " + t.getExitTime() + "pm");
        	     				}
        	     			}
        	     			System.out.println();
        	     			card.displayPayment();
        	     			System.out.println();
        	     			System.out.println("\t\t\t\t$" + t.getCost() + ".00");
        	     		}
        	     		break;
        	     	default:
        	     		System.out.println("Please enter a valid payment method.");
        	     }
        	     System.out.println();
        	     System.out.println();
        	     System.out.println("*** Thank you for choosing Awesome Garage. ***");
        }
    }
}

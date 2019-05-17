package com.Bollhagen.source;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Garage {
    int enterTime = (int) (Math.random() * 5 + 7);
    int exitTime = (int) (Math.random() * 11 + 1);
    int vehicleID = (int) (Math.random()* 201);
    int hours;
    int cost;
    int max = 15;
    int lostTicket = 25;
    int total = cost + lostTicket;


    Scanner input = new Scanner(System.in);
    Ticket ticket = new Ticket();

    ArrayList<Ticket> ticketList = new ArrayList<>();

    public Garage() {
        //total = cost + lostTicket;
        ticket.setTotal(total);
    }

    public void enterCar() throws IOException{
        System.out.println("Awesome Garage");
        System.out.println("--------------");
        ticket = new Ticket();
        ticket.setEnterTime(enterTime);
        ticket.setVehicleID(vehicleID);

       System.out.println("Vehicle ID: " + vehicleID);
       System.out.println(" ");
       if (enterTime == 12){
           System.out.println("Check In Time: " + enterTime + "pm");
       }
       else {
       System.out.println("Check In Time: " + enterTime + "am");
       }
       System.out.println();
       System.out.println();

    }
   public void exitCar ()throws  IOException{
       System.out.println("Awesome Garage");
       System.out.println("--------------");
       ticket.setVehicleID(vehicleID);
       ticket.getVehicleID();
       ticket.setEnterTime(enterTime);
       ticket.getEnterTime();
       ticket.setExitTime(exitTime);
       ticket.getExitTime();


       //get hours
       //1 hour
       if (enterTime == 12 && exitTime == 1){
           hours = 1;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5;
           ticketList.add(ticket);
       } //2 hours
       else if (enterTime == 11 && exitTime == 1 || enterTime == 12 && exitTime == 2){
           hours  = 2;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5;
           ticket.setCost(cost);
           ticketList.add(ticket);
       } //3 hours
       else if (enterTime == 10 && exitTime == 1 || enterTime == 11 && exitTime == 2 || enterTime == 12 && exitTime == 3){
           hours = 3;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5;
           ticket.setCost(cost);
           ticketList.add(ticket);
       } // 4hours
       else if (enterTime == 9 && exitTime == 1 || enterTime == 10 && exitTime == 2 ||
                enterTime == 11 && exitTime == 3 || enterTime == 12 && exitTime == 4){
           hours = 4;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5 + 1; //$6
           ticket.setCost(cost);
           ticketList.add(ticket);
       } //5 hours
       else if (enterTime == 8 && exitTime == 1 || enterTime == 9 && exitTime == 2 ||
                enterTime == 10 && exitTime == 3 || enterTime == 11 && exitTime == 4 ||
                enterTime == 12 && exitTime == 5){
           hours = 5;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5 + 2; //$7
           ticket.setCost(cost);
           ticketList.add(ticket);
       } //6 hours
       else if (enterTime == 7 && exitTime == 1 || enterTime == 8 && exitTime == 2 ||
                enterTime == 9 && exitTime == 3 || enterTime == 10 && exitTime == 4 ||
                enterTime == 11 && exitTime == 5 || enterTime == 12 && exitTime == 6){
           hours = 6;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5 + 3; //$8
           ticket.setCost(cost);
           ticketList.add(ticket);
       } // 7 hours
       else if (enterTime == 7 && exitTime == 2 || enterTime == 8 && exitTime == 3 ||
                enterTime == 9 && exitTime == 4 || enterTime == 10 && exitTime == 5 ||
                enterTime == 11 && exitTime == 6 || enterTime == 12 && exitTime == 7){
           hours = 7;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5 + 4; //$9
           ticket.setCost(cost);
           ticketList.add(ticket);
       } //8 hours
       else if (enterTime == 7 && exitTime == 3 || enterTime == 8 && exitTime == 4 ||
                enterTime == 9 && exitTime == 5 || enterTime == 10 && exitTime == 6 ||
                enterTime == 11 && exitTime == 7 || enterTime == 12 && exitTime == 8){
           hours = 8;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5 + 5; //$10
           ticket.setCost(cost);
           ticketList.add(ticket);
       } //9 hours
       else if (enterTime == 7 && exitTime == 4 || enterTime == 8 && exitTime == 5 ||
                enterTime == 9 && exitTime == 6 || enterTime == 10 && exitTime == 7 ||
                enterTime == 11 && exitTime == 8 || enterTime == 12 && exitTime == 9){
           hours = 9;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5 + 6; //$11
           ticket.setCost(cost);
           ticketList.add(ticket);
       } // 10 hours
       else if (enterTime == 7 && exitTime == 5 || enterTime == 8 && exitTime == 6 ||
                enterTime == 9 && exitTime == 7 || enterTime == 10 && exitTime == 8 ||
                enterTime == 11 && exitTime == 9 || enterTime == 12 && exitTime == 10){
           hours = 10;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5 + 7; //$12
           ticket.setCost(cost);
           ticketList.add(ticket);
       }// 11 hours
       else if (enterTime == 7 && exitTime == 6 || enterTime == 8 && exitTime == 7 ||
                enterTime == 9 && exitTime == 8 || enterTime == 10 && exitTime == 9 ||
                enterTime == 11 && exitTime == 10 || enterTime == 12 && exitTime == 11){
           hours = 11;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5 + 8; //$13
           ticket.setCost(cost);
           ticketList.add(ticket);
       } // 12 hours
       else if (enterTime == 7 && exitTime == 7 || enterTime == 8 && exitTime == 8 ||
                enterTime == 9 && exitTime == 9 || enterTime == 10 && exitTime == 10 ||
                enterTime == 11 && exitTime == 11){
           hours = 12;
           ticket.setHours(hours);
           ticket.getHours();
           cost = 5 + 9; //$14
           ticket.setCost(cost);
           ticketList.add(ticket);
       } //13 hours
       else if (enterTime == 7 && exitTime == 8 || enterTime == 8 && exitTime == 9 ||
                enterTime == 9 && exitTime == 10 || enterTime == 10 && exitTime == 11){
           hours = 13;
           ticket.setHours(hours);
           ticket.getHours();
           cost = max; //$15
           ticket.setCost(cost);
           ticketList.add(ticket);
       } //14 hours
       else if (enterTime == 7 && exitTime == 9 || enterTime == 8 && exitTime == 10 ||
                enterTime == 9 && exitTime == 11){
           hours = 14;
           ticket.setHours(hours);
           ticket.getHours();
           cost = max; //$15
           ticket.setCost(cost);
           ticketList.add(ticket);
       }//15 hours
       else if (enterTime == 7 && exitTime == 10 || enterTime == 8 && exitTime == 11){
           hours = 15;
           ticket.setHours(hours);
           ticket.getHours();
           cost = max; //$15
           ticket.setCost(cost);
           ticketList.add(ticket);
       }//16 hours
       else {
           hours = 16;
           ticket.setHours(hours);
           ticket.getHours();
           cost = max; //$15
           ticket.setCost(cost);
           ticketList.add(ticket);
       }

        //receipt
       System.out.println("Receipt for vehicle ID: " + vehicleID);
       System.out.println();
       System.out.println();
       if (enterTime == 12){
           System.out.println(hours + " hours parked " + enterTime + "pm " + "- " + exitTime + "pm");
       }
       else{
       System.out.println(hours + " hours parked " + enterTime + "am " + "- " + exitTime + "pm");
       }

       System.out.println();
       System.out.println("$" + cost + ".00");
       System.out.println();
       System.out.println("*** Thank you for choosing Awesome Garage. ***");
       writeTicketFile();
   } // end exit
    public void LostTicket() throws  IOException{
        System.out.println("Awesome Garage");
        System.out.println("--------------");
        ticket.setVehicleID(vehicleID);
        ticket.getVehicleID();
        ticket.setLostTicket(lostTicket);
        ticketList.add(ticket);
        System.out.println("Receipt for vehicle ID: " + vehicleID);
        System.out.println();
        System.out.println("Lost Ticket \n" + "$" + lostTicket + ".00");
        System.out.println();
        System.out.println("*** Thank you for choosing Awesome Garage. ***");
        writeTicketFile();
    }

   public void sumTotals() {
                int costSum = 0;
                int lostSum = 0;

            for (int i = 0; i < ticketList.size(); i++){
                costSum = costSum + ticketList.get(i).getCost();
                lostSum = lostSum + ticketList.get(i).getLostTicket();
        }
          int grandTotal = costSum + lostSum;

       System.out.println("Total from Check In: $" + costSum + "\nTotal from Lost Tickets $" + lostSum +
               "\n\nTotal to date: $" + grandTotal);
   }
    public void writeTicketFile()throws  IOException{
        File file = new File("Garage.txt");//file name
        PrintWriter outputFile = new PrintWriter(file);
        Ticket ticket;
        for (int i = 0; i < ticketList.size(); i++){
            ticket = ticketList.get(i);
            String moneyCollected = ticket.toString();
            outputFile.println(moneyCollected);
        }
        outputFile.close();
    }
    public void readTicketFile()throws IOException {
        File file = new File("Garage.txt");//file name
        Scanner inputFile = new Scanner(file);//read
        String line;
        String [] items;
        while (inputFile.hasNext()) {
            line = inputFile.nextLine();
            items = line.split(",");
            ticket = new Ticket();
            ticket.setTicket(Integer.parseInt(items[0]), Integer.parseInt(items[1]));
            ticketList.add(ticket);
        }
        inputFile.close();
    }
   public void closeGarage()throws IOException{
        writeTicketFile();
       System.out.println("Awesome Garage");
       System.out.println("--------------");
       sumTotals();
   }
}

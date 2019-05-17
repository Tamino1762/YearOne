package com.Theresa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Close uses a Singleton since there should be only one close action per day.
 *
 * The Close Class also gathers ticket info for sums of ticket types and a sum for all tickets
 * Also writes the sums to file and reads the file.
 */

public class Close {

    private static Close uniqueInstance;
    private Close (){
        boolean isClosed = false;
    }
    public static Close getInstance (){
        if (uniqueInstance == null) {
            uniqueInstance = new Close();
        }
        return uniqueInstance;
    }

    Hourly hourly = new Hourly();
    SpecialEvent specialEvent = new SpecialEvent();
    Lost lost = new Lost();
    int total;
    int hourlySum = 0;
    int specialEventSum = 0;
    int lostSum = 0;


    TicketFactory ticketFactory = new TicketFactory();
    ArrayList<Ticket> tickets = new ArrayList<>();


    public void SumTotals () throws IOException {
		int numberHourly = 0;
		int numberSpecialEvent = 0;
		int numberLost = 0;
        for (int i = 0; i < tickets.size(); i++){
            if(tickets.get(i).getType() == "Hourly" && tickets.get(i).getCost() > 0) {
            		numberHourly++;
                hourlySum = hourlySum + tickets.get(i).getCost();
                total = total + tickets.get(i).getCost();
            }
            if(tickets.get(i).getType() == "SpecialEvent" && tickets.get(i).getCost() > 0) {
            		numberSpecialEvent++;
                specialEventSum = specialEventSum + tickets.get(i).getCost();
                total = total + tickets.get(i).getCost();
            }
            if(tickets.get(i).getType() == "Lost" && tickets.get(i).getCost() > 0) {
            		numberLost++;
                lostSum = lostSum + tickets.get(i).getCost();
                total = total + tickets.get(i).getCost();
            }

        }
        System.out.println ("Awesome Parking Garage");
        System.out.println ("=========================");
        System.out.println ("Activity to Date");
        System.out.println("$" + hourlySum + " was collected from " + numberHourly + " Check Ins");
        System.out.println("$" + specialEventSum + " was collected from " + numberSpecialEvent + " Special Events");
        System.out.println("$" + lostSum + " was collected from " + numberLost + " Lost Tickets");
        System.out.println("$" + total + " was collected overall");
    }
    public void addTicketToFile(String str) {
    		try {
    			BufferedWriter out = new BufferedWriter(new FileWriter("Garage.txt", true));
    			out.write(str + "\n");
    			out.close();
    		}
    		catch (IOException e) {
    			System.out.println("exception occoured" + e);
    		}
    }

    public void ReadFile() throws IOException{

        File file = new File ("Garage.txt");
        Scanner inputFile = new Scanner(file);
        String line;
        String [] items;

        while (inputFile.hasNext()){
            line = inputFile.nextLine();
            items = line.split(",");
            hourly = new Hourly();
            hourly.setCost(Integer.parseInt(items[0]));
            tickets.add (hourly);
            specialEvent = new SpecialEvent();
            specialEvent.setCost(Integer.parseInt(items[1]));
            tickets.add(specialEvent);
            lost = new Lost();
            lost.setCost(Integer.parseInt(items[2]));
            tickets.add(lost);
        }
        inputFile.close();
    }
}


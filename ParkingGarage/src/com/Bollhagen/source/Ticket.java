package com.Bollhagen.source;

/**
 * @author Theresa Bollhagen
 * @version 1.0
 * Ticket class gathers info about the times, hours and costs
 */

public class Ticket {

    private int vehicleID = (int) (Math.random() * 201); //generates a random number for a vehicle ID
    private int enterTime;
    private int exitTime;
    private int hours;
    private int cost;
    private int lostTicket;
    private int total = cost + lostTicket;

    public Ticket() {
    }

    /**
     *
     * @param vehicleID
     */

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    /**
     *
     * @param enterTime
     */
    public void setEnterTime(int enterTime) {
        this.enterTime = enterTime;
    }

    public int getEnterTime() {
        return enterTime;
    }

    /**
     *
     * @param exitTime
     */
    public void setExitTime(int exitTime) {
        this.exitTime = exitTime;
    }
    public int getExitTime() {return exitTime;}

    /**
     *
     * @param hours
     */

    public void setHours(int hours){
        this.hours = hours;
    }
    public int getHours() {
        return hours;
    }

    /**
     *
     * @param cost
     */
    public void setCost(int cost){
        this.cost = cost;
    }
    public int getCost(){
        return cost;
    }

    /**
     *
     * @param lostTicket
     */
    public void setLostTicket(int lostTicket) {
        this.lostTicket = lostTicket;
    }

    public int getLostTicket() {
        return lostTicket;
    }

    /**
     *
     * @param to
     * total
     */
    public void setTotal(int to){
        this.total = to;
    }

    public int getTotal() {

        return total;
    }

    /**
     *
     * @param c
     * cost
     * @param lt
     * lost ticket
     */
    public void setTicket(int c, int lt){
        cost = c;
        lostTicket = lt;
    }
    public int getTicket(){
        return Integer.parseInt(cost + "," + lostTicket + "," + total);
    }

    /**
     * To string
     * @return
     */
    @Override
    public String toString() {
        return cost + "," + lostTicket;
    }
}


package com.Theresa;

public class SpecialEvent implements Ticket {
	int vehicleID;
	int payment;
	int cost = 20;
    int enterTime;
    int exitTime;
    String type = "SpecialEvent";

	@Override
    public String getType() {
        return type;
    }
	@Override
    public void setEnterTime(int enterTime) {
        this.enterTime = enterTime;
    }
	@Override
    public int getEnterTime() {
        return enterTime;
    }
	@Override
    public void setExitTime(int exitTime) {
        this.exitTime = exitTime;
    }
	@Override
    public int getExitTime() {
        return exitTime;
    }
	@Override
    public void setCost(int cost) {
        this.cost = cost;
    }
	@Override
    public int getCost() {
        return cost;
    }
	@Override
	public void setPayment(int payment) {
        this.payment = payment;
    }
	@Override
    public int getPayment() {
        return payment;
    }
	@Override
	public void setVehicleID(int v) {
        this.vehicleID = v;
    }
	@Override
    public int getVehicleID() {
        return vehicleID;
    }
    @Override
    public void displayInTicket() {
        System.out.println("Vehicle ID# " + getVehicleID() + "\nSpecial Event");
        System.out.println();
        System.out.println();
    }
    @Override
    public void displayOutTicket() {

        System.out.println("Special Event \n" + "$" + getCost() + ".00");
        System.out.println();
    }
}

package com.Theresa;

public class Lost implements Ticket{
	int vehicleID;
	int payment;
	int cost = 25;
    int enterTime;
    int exitTime;
    String type = "Lost";

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
        //does nothing -- no lost ticket in times or events
    }
    @Override
    public void displayOutTicket() {
        System.out.println("Awesome Garage");
        System.out.println("--------------");
        System.out.println("Lost Ticket \n" + "$" + getCost() + ".00");
        System.out.println();
    }
}

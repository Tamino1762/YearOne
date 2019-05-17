package com.Theresa;

public class Hourly implements Ticket {
	int vehicleID;
	int payment;
	int cost = 15;
    int enterTime;
    int exitTime;
    String type = "Hourly";

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
	/**
	 * Overrides Ticket Display
	 */
	public void displayInTicket() {
		System.out.println("Awesome Garage");
	    System.out.println("--------------");
	    System.out.println("Vehicle ID: " + getVehicleID());
	    System.out.println(" ");
	    if (enterTime == 12){
	    	    System.out.println("Check In Time: " + getEnterTime() + "pm");
	    }
	    else {
	        System.out.println("Check In Time: " + getEnterTime() + "am");
	    }
	        System.out.println();
	        System.out.println();
	}
	/**
	* Overrides Ticket Display
	*/
	@Override
	public void displayOutTicket() {
	    int hours = ((getExitTime() + 12) - getEnterTime());
	    System.out.println("Awesome Garage");
	    System.out.println("--------------");

	    if (enterTime == 12) {
	    		System.out.println(hours + " hours parked " + getEnterTime() + "pm " + "- " + getExitTime() + "pm");
	    } else {
	        System.out.println(hours + " hours parked " + getEnterTime() + "am " + "- " + getExitTime() + "pm");
	    }

	    System.out.println();
	    System.out.println("$" + getCost() + ".00");
	    System.out.println();
	}

}

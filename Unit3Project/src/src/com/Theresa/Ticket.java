package com.Theresa;

public interface Ticket {
	void setPayment(int p);
	int getPayment();
	void setVehicleID(int v);
	int getVehicleID();
	void displayInTicket();
	void displayOutTicket();
	void setEnterTime(int enterTime);
    int getEnterTime();
    void setExitTime(int exitTime);
    int getExitTime();
    void setCost(int cost);
    int getCost();
    String getType();
}

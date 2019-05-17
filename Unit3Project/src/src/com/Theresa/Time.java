package com.Theresa;

public class Time {
    int enterTime;
    int exitTime;
    int hours;

    public void setEnterTime() {
    		this.enterTime = (int) (Math.random() * 5 + 7);
    }
    public int getEnterTime() {
    		return enterTime;
    }
    public void setExitTime() {
		this.exitTime = (int) (Math.random() * 11 + 1);
    }
    public int getExitTime() {
		return exitTime;
    }
    public void setHours() {
    		this.hours = ((exitTime + 12) - enterTime);
    }
    public int getHours() {
    	  	return hours;
    }
}

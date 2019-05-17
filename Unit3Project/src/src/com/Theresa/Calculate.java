package com.Theresa;
/**
 * A universal Calculation that all classes can use
 */
public class Calculate {
	int cost = 0;
	int max = 15;

	public int calculateCost(int hours) {
        if (hours <= 3) {
            cost = 5;
        }
        else if (hours > 3 && hours <= 10){
            cost = 5 + hours;
        }
        else {
            cost = max;
        }
	    return cost;
	}
}

package com.Theresa;

/**
 * This a Factory Pattern for all tickets
 */

public class TicketFactory {

    public Ticket getTicketTypes(TicketTypes ticketTypes) {

        switch (ticketTypes) {
            case HOURLY: return new Hourly();
            case SPECIALEVENT: return new SpecialEvent();
            case LOST: return new Lost();
            default: return null;
        }
    }

}

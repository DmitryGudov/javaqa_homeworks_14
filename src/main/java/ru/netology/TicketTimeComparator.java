package ru.netology;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {

        int FlightTimeOne;
        int FlightTimeTwo;

        if ((t1.getTimeTo() - t1.getTimeFrom()) < 0) {
            FlightTimeOne = 24 - Math.abs(t1.getTimeTo() - t1.getTimeFrom());
        } else {
            FlightTimeOne = t1.getTimeTo() - t1.getTimeFrom();
        }

        if ((t2.getTimeTo() - t2.getTimeFrom()) < 0) {
            FlightTimeTwo = 24 - Math.abs(t2.getTimeTo() - t2.getTimeFrom());
        } else {
            FlightTimeTwo = t2.getTimeTo() - t2.getTimeFrom();
        }

        if (FlightTimeOne < FlightTimeTwo) {
            return -1;
        } else if (FlightTimeOne > FlightTimeTwo) {
            return 1;
        } else {
            return 0;
        }
    }

}
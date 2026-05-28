package org.example.Day30.service;

import org.example.Day30.model.InvoiceSummary;
import org.example.Day30.model.Ride;

public class CabInvoiceGenerator {

    public double calculateFare(Ride ride) {
        double fare = ride.distance * ride.rideType.costPerKm
                + ride.time * ride.rideType.costPerMinute;
        return Math.max(fare, ride.rideType.minimumFare);
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}
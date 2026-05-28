package org.example.Day30.service;


import org.example.Day30.InvoiceService;
import org.example.Day30.model.InvoiceSummary;
import org.example.Day30.model.Ride;
import org.example.Day30.model.RideType;
import org.example.Day30.repo.RideRepository;

public class CabInvoiceMain {
    public static void main(String[] args) {

        Ride[] rides = {
                new Ride(2.0, 5, RideType.NORMAL),
                new Ride(3.0, 10, RideType.PREMIUM)
        };

        RideRepository repository = new RideRepository();
        repository.addRides("USER_1", rides);

        InvoiceService service = new InvoiceService(repository);
        InvoiceSummary summary = service.getInvoice("USER_1");

        System.out.println("Total Rides: " + summary.totalRides);
        System.out.println("Total Fare: Rs." + summary.totalFare);
        System.out.println("Average Fare: Rs." + summary.averageFare);
    }
}
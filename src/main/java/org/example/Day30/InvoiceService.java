package org.example.Day30;

import org.example.Day30.model.InvoiceSummary;
import org.example.Day30.model.Ride;
import org.example.Day30.repo.RideRepository;
import org.example.Day30.service.CabInvoiceGenerator;

public class InvoiceService {

    private final RideRepository repository;
    private final CabInvoiceGenerator generator;

    public InvoiceService(RideRepository repository) {
        this.repository = repository;
        this.generator = new CabInvoiceGenerator();
    }

    public InvoiceSummary getInvoice(String userId) {
        Ride[] rides = repository.getRides(userId);
        return generator.calculateFare(rides);
    }
}

package com.example.finalassignment.service.impl;
import com.example.finalassignment.model.Ticket;
import com.example.finalassignment.repository.impl.TicketRepositoryImpl;
import com.example.finalassignment.repository.impl.UserRepositoryImpl;
import com.example.finalassignment.service.TicketService;
import jakarta.inject.Inject;

import java.util.List;

public class TicketServiceImpl implements TicketService{

    @Inject
    private TicketRepositoryImpl ticketRepositoryImpl;

    @Inject
    private UserRepositoryImpl userRepositoryImpl;


    @Override
    public Ticket create(Ticket ticket) {
        return ticketRepositoryImpl.create(ticket);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepositoryImpl.read();
    }

    @Override
    public Ticket findByTicketId(Long column1Id) {
        return ticketRepositoryImpl.read(column1Id);
    }

    @Override
    public Ticket update(Ticket ticket) {
        return ticketRepositoryImpl.update(ticket);
    }

    @Override
    public boolean delete(Long column1Id) {
        return ticketRepositoryImpl.delete(column1Id);
    }

    @Override
    public List<Ticket> getTicketsByUserId(Long column1Id) {
        return ticketRepositoryImpl.getTicketsByUserId(column1Id);
    }
}

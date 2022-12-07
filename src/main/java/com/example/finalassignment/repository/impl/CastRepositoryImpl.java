package com.example.finalassignment.repository.impl;

import com.example.finalassignment.model.Ticket;
import com.example.finalassignment.repository.TicketRepository;
import com.example.finalassignment.model.User;
import jakarta.persistence.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TicketRepositoryImpl extends RepositoryImpl<Ticket, Long> implements TicketRepository {
    @Override
    public Class<Ticket> getClassType() {
        return Ticket.class;
    }

    @Override
    public String getClassName() {
        return Ticket.class.getSimpleName();
    }

    public List<Ticket> getTicketsByUserId(Long columnId) {
        Query query = super.getEm().createQuery("select t from "+ getClassName()+ " t WHERE t.customer IN (SELECT DISTINCT u.columnId FROM User u WHERE u.columnId IN (?1)) " );

        query.setParameter(1, columnId);

        List<Ticket> tickets = query.getResultList();

        return tickets;
    }



}
package com.example.finalassignment.service;

import com.example.finalassignment.model.Ticket;
import jakarta.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Transactional
public interface TicketService {
    Ticket create(Ticket ticket);
    List<Ticket> findAll();
    Ticket findByTicketId(Long column1Id);
    Ticket update(Ticket ticket);
    boolean delete(Long column1Id);
    List<Ticket> getTicketsByUserId(Long column1Id);
//    List<Ticket> findByDate(LocalDate date);
//    List<Ticket> findByDateRange(LocalDate dateFrom, LocalDate dateTo);


}

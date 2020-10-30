package com.example.demo.dao.Interfaces;

import com.example.demo.model.Loan;

import java.util.List;
import java.util.Optional;

public interface LoansDAO {
    Optional<Loan> getById(String uid);

    List<Loan> getAll();

    List<Loan> save(Loan loan);

    List<Loan> deleteById(String uid);
}

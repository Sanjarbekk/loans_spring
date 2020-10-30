package com.example.demo.dao;

import com.example.demo.dao.Interfaces.LoansDAO;
import com.example.demo.model.Loan;
import com.example.demo.repository.LoansRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoansDAOImpl implements LoansDAO {

    LoansRepository repository;

    public LoansDAOImpl(LoansRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Loan> getById(String uid) {
        return repository.findById(uid);
    }

    @Override
    public List<Loan> getAll() {
        List<Loan> loanList = new ArrayList<>();
        loanList = getAll();
        return loanList;
    }

    @Override
    public List<Loan> save(Loan loan) {
        repository.save(loan);
        return getAll();
    }

    @Override
    public List<Loan> deleteById(String uid) {
        repository.deleteById(uid);
        return getAll();
    }
}

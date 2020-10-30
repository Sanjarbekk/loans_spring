package com.example.demo.repository;

import com.example.demo.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoansRepository extends JpaRepository<Loan, String> {

    List<Loan> findAll();

    Optional<Loan> findById(String uid);

}

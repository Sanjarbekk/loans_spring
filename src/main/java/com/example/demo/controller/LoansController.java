package com.example.demo.controller;


import com.example.demo.model.Loan;
import com.example.demo.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class LoansController {

    @Autowired
    LoansRepository loansRepo;

    @GetMapping("/loans")
    public List<Loan> allLoans() {
        return (List<Loan>) loansRepo.findAll();
    }


    @PostMapping("/loan")
    public List<Loan> addLoans(@Validated @RequestBody Loan model) {
        loansRepo.save(model);
        return (List<Loan>) loansRepo.findAll();
    }


    @GetMapping("/getOneLoan/{uid}")
    public Optional<Loan> oneLoan(@PathVariable String uid) {
        Optional<Loan> loansModel = loansRepo.findById(uid);
        return loansModel;
    }

    @DeleteMapping("/deleteLoan/{uid}")
    public List<Loan> deleteLoan(@PathVariable String uid) {
        loansRepo.deleteById(uid);
        return (List<Loan>) loansRepo.findAll();
    }

}

package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Loan")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    @Id
    private String uid;

    @Column
    private String fullName;

    @Column
    private String number;

    @Column
    private String money;

    @Column
    private String toDay;

    @Column
    private String returnDay;

    @Column
    private Boolean loanType;
}
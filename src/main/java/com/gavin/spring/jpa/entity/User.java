package com.gavin.spring.jpa.entity;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Value
public class User {

    @Id
    @GeneratedValue
    private Long userId;

    @Column
    private String userName;

    @Column
    private Date dayOfBirth;
}

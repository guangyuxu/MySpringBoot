package com.gavin.spring.jpa.entity;

import lombok.Data;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Value
public class TblTestIdentity implements Serializable {

    @Column(name = "id1")
    private int id1;

    @Column(name = "id2")
    private int id2;

    @Column(name = "id3")
    private int id3;
}

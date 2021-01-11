package com.ecommerce.store.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@BaseEntity
@Data
public abstract class Base {

    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @Column(name="id")
    int id;

    public Base(){

    }
    public Base(int id){
        this.id = id;
    }
}

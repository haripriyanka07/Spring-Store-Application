package com.ecommerce.store.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="products")
@Data
public class Product{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private String price;

    public Product() {

    }
    public Product(int id, String name, String price){
//        super(id);
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

package com.masai.CabApp.model;


import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
    private int userId ;
private String userName ;
private String password ;
private Address address ;
    private String mobileNumber ;
private String email ;

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
    }

}

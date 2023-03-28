package com.masai.CabApp.model;

import com.masai.CabApp.CabAppApplication;
import lombok.Data;
import org.springframework.boot.SpringApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id ;
   private CarType type ;
    private String registrationNumber ;
    private int engineNumber ;
    private int passengerCapacity ;
    private int baseFare ;
    private int costPerKM ;
    private boolean AC ;

    public Vehicle(CarType sedan) {
    }


    // private Driver driver ;
}

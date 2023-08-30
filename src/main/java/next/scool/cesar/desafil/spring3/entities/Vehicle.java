package next.scool.cesar.desafil.spring3.entities;

import jakarta.persistence.Id;

public class Vehicle {
    @Id
    private String brand;
    private String model;
    private int year;

    
}

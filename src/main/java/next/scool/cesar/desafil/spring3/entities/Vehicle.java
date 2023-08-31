package next.scool.cesar.desafil.spring3.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column (nullable = false, updatable = false, unique = true)
    private long id;
    
    @Column(name = "brand", nullable = false)
    private String brand;
    
    @Column(name = "model", nullable = false)
    private String model;
    
    @Column(name = "year", nullable = false)
    private int year;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
}

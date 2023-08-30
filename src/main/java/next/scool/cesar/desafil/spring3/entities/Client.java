package next.scool.cesar.desafil.spring3.entities;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder 
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping
public class Client {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private int dependents;
    private double income;
    private String materialStatus;
    private LocalDate createdAt;
    private LocalDate updateAt;

    
}

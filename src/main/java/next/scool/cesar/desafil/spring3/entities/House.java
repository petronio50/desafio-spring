package next.scool.cesar.desafil.spring3.entities;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
Builder 
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping
public class House {
   
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ownershipStatus;
    private String location;
    private String zipcode;

    
}

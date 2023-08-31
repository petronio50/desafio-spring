package next.scool.cesar.desafil.spring3.entities;

import org.springframework.web.bind.annotation.RequestMapping;

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

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping
@Table(name = "Horse")
public class House {
   
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (nullable = false, updatable = false, unique = true) 
    private long id; 
    
    @Column(name = "ownership_Status", nullable = false)
    private String ownershipStatus;
    @Column(name = "location", nullable = false)
    private String location;
    @Column(name = "zipcode", nullable = false)    
    private String zipcode;
    // Na linha 40 a anotação indica a existência da cardinalidade de muitos para um.
    // Na linha 41 indica que a entidade é a responsável pelo relacionamento.
    @ManyToOne
    @JoinColumn(name="client_id", nullable = false)
    private Client client;
    
}

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
@Table(name = "Insurance")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (nullable = false, updatable = false, unique = true)
    private long id;
    
    @Column(name = "type", nullable = false)
    private String type;
    
    @Column(name = "risk", nullable = false)
    private int risk;
    
    @Column(name = "analysis", nullable = false)
    private String analysis;
   
    @Column(name = "observation", nullable = true)
    private String observation;
    
    @Column(name = "created_at", nullable = false)
    private Data createdAt;
    
    @Column(name = "validate_at", nullable = false)
    private Data validatedAt;

    @ManyToOne
    @JoinColumn(name = "id_Client", nullable = false)
    private Client client;

    
}

package next.scool.cesar.desafil.spring3.entities;

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
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private int risk;
    private String analysis;
    private String observation;
    private Data createdAt;
    private Data validatedAt;

    
}

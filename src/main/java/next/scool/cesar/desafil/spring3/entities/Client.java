package next.scool.cesar.desafil.spring3.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "Client") //Nesta linha, a anotação JPA é usada para adicionar o nome da
                        //tabela no banco de dados MySQL específico. 

public class Client {
    
    @Id  // Nesta linha a anotação @Id é que o JPA é usado para criar uma chave primária variável específica.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Nesta linha a anotação criara automaticamente o id no BD.
    
    @Column (nullable = false, updatable = false, unique = true) 
    // fica noticiado que o id não poderá ser nulo, vai ser atualizado e único
    private long id;

    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "age", nullable = false)
    private int age;
    
    @Column(name = "dependents", nullable = false)
    private int dependents;
    
    @Column(name = "income", nullable = false)
    private double income;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    private MaterialStatus maritalStatus;


    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt; 
    
    @Column(name = "update_At",nullable = false)
    private LocalDate updateAt;

    // Na linha abaixo a anotação indica a cardinalidade de muitos para um.
    //Nas linhas 68, 71 e 74 foi utilizado 
    // Nas linhas 67, 70 e 73, foi usado o atributo mappedBy, para que não fosse criada relacionamentos.
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "client")
    private List<Vehicle> vehicles;
    
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "client")
    private List<House> houses;
    
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "client")
    private List<Insurance> insurances;

    
}

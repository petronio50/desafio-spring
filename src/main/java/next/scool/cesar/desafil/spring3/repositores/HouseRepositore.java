package next.scool.cesar.desafil.spring3.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import next.scool.cesar.desafil.spring3.entities.House;

public interface HouseRepositore extends JpaRepository<House, Long> {
    
}

package fr.formation.simulator.repositories;

import fr.formation.simulator.dtos.LoanSimulationViewDto;
import fr.formation.simulator.entities.LoanSimulation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface LoanSimulationRepository extends JpaRepository<LoanSimulation, Long> {

    LoanSimulationViewDto getById(Long id);

    List<LoanSimulationViewDto> getAllProjectedBy(Pageable pageable);

}

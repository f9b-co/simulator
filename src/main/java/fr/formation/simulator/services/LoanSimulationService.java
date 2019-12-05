package fr.formation.simulator.services;

import fr.formation.simulator.dtos.LoanSimulationDto;
import fr.formation.simulator.dtos.LoanSimulationViewDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoanSimulationService {

    void create(LoanSimulationDto dto);

    void update(Long id, LoanSimulationDto dto);

    LoanSimulationViewDto getOne(Long id);

    List<LoanSimulationViewDto> getAll(Pageable pageable);

    void delete(Long id);
}

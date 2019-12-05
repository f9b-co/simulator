package fr.formation.simulator.services;

import fr.formation.simulator.dtos.LoanSimulationDto;
import fr.formation.simulator.dtos.LoanSimulationViewDto;
import fr.formation.simulator.entities.LoanSimulation;
import fr.formation.simulator.repositories.LoanSimulationRepository;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class LoanSimulationServiceImpl implements LoanSimulationService {

    private final LoanSimulationRepository loanSimulationRepo;

    protected LoanSimulationServiceImpl(LoanSimulationRepository loanSimulationRepo) {
        this.loanSimulationRepo = loanSimulationRepo;
    }

    @Override
    public void create(LoanSimulationDto dto) {
        LoanSimulation loanSimulation = new LoanSimulation();
        populateAndSave(dto, loanSimulation);
    }

    @Override
    public void update(Long id, LoanSimulationDto dto) {
        LoanSimulation loanSimulation = loanSimulationRepo.findById(id).get();
        populateAndSave(dto, loanSimulation);
    }

    private void populateAndSave(LoanSimulationDto dto, LoanSimulation loanSimulation) {
        // Convert dto to entity:
        loanSimulation.setAmount(dto.getAmount());
        loanSimulation.setLoanType(dto.getLoanType());
        loanSimulation.setStartDate(dto.getStartDate());
        loanSimulation.setDuration(dto.getDuration());
        loanSimulation.setLoanRate(dto.getLoanRate());
        loanSimulation.setInsuranceRate(dto.getInsuranceRate());
        loanSimulationRepo.save(loanSimulation); // Save to database
    }

    @Override
    public LoanSimulationViewDto getOne(Long id) {
        return loanSimulationRepo.getById(id);
    }

    @Override
    public List<LoanSimulationViewDto> getAll(Pageable pageable) {
        return loanSimulationRepo.getAllProjectedBy(pageable);
    }

    @Override
    public void delete(Long id) {
        loanSimulationRepo.deleteById(id);
    }

}

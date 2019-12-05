package fr.formation.simulator.controllers;

import fr.formation.simulator.dtos.LoanSimulationDto;
import fr.formation.simulator.dtos.LoanSimulationViewDto;
import fr.formation.simulator.services.LoanSimulationService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/LoanSimulations")
public class LoanSimulationController {

    private final LoanSimulationService service;

    protected LoanSimulationController(LoanSimulationService service) {
        this.service = service;
    }

    @PostMapping
    protected void create(@Valid @RequestBody LoanSimulationDto dto) {
        service.create(dto);
    }

    @GetMapping("/{id}")
    protected LoanSimulationViewDto getOne(@PathVariable("id") Long id) {
        return service.getOne(id);
    }

    @GetMapping
    protected List<LoanSimulationViewDto> getAll(@RequestParam("p") int page, @RequestParam("s") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return service.getAll(pageable);
    }

    @PutMapping("/{id}")
    protected void update(@PathVariable("id") Long id, @Valid @RequestBody LoanSimulationDto dto) {
        service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    protected void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

}

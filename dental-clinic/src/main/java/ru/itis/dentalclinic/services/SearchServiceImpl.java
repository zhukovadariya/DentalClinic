package ru.itis.dentalclinic.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.dentalclinic.entities.Procedure;
import ru.itis.dentalclinic.repositories.ProcedureRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService{

    private final ProcedureRepository procedureRepository;

    @Override
    public List<Procedure> searchProcedures(String name) {
        return procedureRepository.findByNameContaining(name);

    }
}

package ru.itis.dentalclinic.services;

import ru.itis.dentalclinic.entities.Procedure;

import java.util.List;

public interface SearchService {
    List<Procedure>  searchProcedures(String name);
}

package ru.itis.dentalclinic.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.dentalclinic.entities.Procedure;
import ru.itis.dentalclinic.services.SearchService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class SearchProcedureController {

    private final SearchService searchService;

    @GetMapping("/search")
    public String getSearchProcedurePage() {
        return "search_procedure";
    }

    @RequestMapping(value = "/search/byName", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Procedure> searchProcedureByNamePage(@RequestParam("procedureName") String procedureName) {
        List<Procedure> result = searchService.searchProcedures(procedureName);
        System.out.println(result);
        return result;
    }
}

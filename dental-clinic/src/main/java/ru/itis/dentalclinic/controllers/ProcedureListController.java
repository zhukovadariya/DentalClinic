package ru.itis.dentalclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProcedureListController {

    @GetMapping("/procedureList")
    public String getProcedureListPage() {
        return "procedure_list";
    }
}

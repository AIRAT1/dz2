package de.dz2.controller;

import de.dz2.model.Company;
import de.dz2.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/companies")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("{id}")
    public Company findBookById(@PathVariable("id") Long id) {
        return companyService.findBookById(id);
    }
}

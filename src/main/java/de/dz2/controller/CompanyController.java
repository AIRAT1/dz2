package de.dz2.controller;

import de.dz2.model.Company;
import de.dz2.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CompanyController {
    private final CompanyService service;

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable("id") int id) {
        return service.getCompanyById(id);
    }
}

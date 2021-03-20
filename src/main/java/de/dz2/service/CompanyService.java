package de.dz2.service;

import de.dz2.exception.WrongCompanyIdException;
import de.dz2.model.Company;
import de.dz2.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company findBookById(Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new WrongCompanyIdException("Company with ID " + id + " don't exists"));
    }
}

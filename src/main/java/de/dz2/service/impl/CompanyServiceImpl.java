package de.dz2.service.impl;

import de.dz2.model.Company;
import de.dz2.service.CompanyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Override
    @Transactional(readOnly = true)
    public Company findById(int id) {
        return Company.builder()
                .id(id)
                .build();
    }

    @Override
    public Company create(Company company) {
        return company;
    }

    @Override
    public Company updateByPut(Company company, int id) {
        return company;
    }

    @Override
    public Company updateByPatch(Company company, int id) {
        return company;
    }

    @Override
    public void delete(int id) {

    }
}

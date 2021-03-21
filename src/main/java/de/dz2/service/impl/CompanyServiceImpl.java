package de.dz2.service.impl;

import de.dz2.model.Company;
import de.dz2.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Override
    public Company getCompanyById(int id) {
        return Company.builder()
                .id(id)
                .build();
    }
}

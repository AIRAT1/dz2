package de.dz2.service;

import de.dz2.model.Company;

public interface CompanyService {
    Company findById(int id);
    Company create(Company company);
    Company updateByPut(Company company, int id);
    Company updateByPatch(Company company, int id);
    void delete(int id);
}

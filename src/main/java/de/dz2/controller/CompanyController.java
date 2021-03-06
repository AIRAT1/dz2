package de.dz2.controller;

import de.dz2.model.Company;
import de.dz2.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping("/{id}")
    public Company findById(@PathVariable("id") int id) {
        return companyService.findById(id);
    }

    @PostMapping
    public Company create(@RequestBody Company company) {
        return companyService.create(company);
    }

    @PutMapping("/{id}")
    public Company updateByPut(
            @RequestBody Company company,
            @PathVariable("id") int id,
            @RequestParam("id") int paramID,
            @RequestHeader Map<String, String> headers,
            @RequestHeader(value = "Content-Type") String contentType,
            HttpServletRequest request,
            HttpServletResponse response) {
        return companyService.updateByPut(company, id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus
    public Company updateByPatch(@RequestBody Company company, @PathVariable("id") int id) {
        return companyService.updateByPatch(company, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        companyService.delete(id);
    }
}

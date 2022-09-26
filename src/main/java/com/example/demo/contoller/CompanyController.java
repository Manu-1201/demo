package com.example.demo.contoller;

import com.example.demo.model.Company;
import com.example.demo.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/test")
public class CompanyController {
    @Autowired
    ServiceInterface serviceInterface;

    @PostMapping("/create")
    public void addCompany(@RequestBody Company company){
        serviceInterface.addCompany(company);

    }

    @PutMapping("/update")
    public void updateCompany(@RequestBody Company company){
        serviceInterface.updateCompany(company);
    }

    @GetMapping("/read")
    public List<Company> getAllCompanies(){
        List<Company> c1 = serviceInterface.getAllCompanies();
        return c1;
    }
}
package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceClass implements ServiceInterface{
    @Autowired
    CompanyRepo companyRepo;

    @Override
    public void addCompany(Company company){

        companyRepo.save(company);
    }

    @Override
    public void updateCompany(Company company) {

        companyRepo.save(company);
    }

    public List<Company> getAllCompanies(){
        List<Company> c2 = companyRepo.findAll();
        return c2;
    }
}

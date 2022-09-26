package com.example.demo.repository;

//import com.org.cts.master.model.Company;
import com.example.demo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CompanyRepo extends JpaRepository<Company,Integer> {
    /*@Transactional
    String deleteByAddress(String companyLocation);*/
}

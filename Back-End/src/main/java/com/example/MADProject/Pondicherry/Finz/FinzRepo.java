package com.example.MADProject.Pondicherry.Finz;

import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FinzRepo extends JpaRepository<FinzModel, Integer>{
    
}

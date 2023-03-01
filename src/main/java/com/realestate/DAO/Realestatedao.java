package com.realestate.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.realestate.bean.Realestate;

public interface Realestatedao extends JpaRepository<Realestate,String> {
    
}

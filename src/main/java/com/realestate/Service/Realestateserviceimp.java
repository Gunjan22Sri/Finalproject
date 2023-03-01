package com.realestate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realestate.DAO.Realestatedao;
import com.realestate.bean.Realestate;

@Service
public class Realestateserviceimp implements Realestateservice {
    @Autowired
    Realestatedao dao;

    @Override
    public Realestate addLogin(Realestate realestate) {
        Realestate data = dao.save(realestate);
        System.out.println(data);
        return data;
    }

}

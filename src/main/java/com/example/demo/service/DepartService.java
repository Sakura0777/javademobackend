package com.example.demo.service;


import com.example.demo.bean.Depart;

import java.util.List;

public interface DepartService {
    public List<Depart> selectAll();
    public Boolean insert(String name,Integer location);

}
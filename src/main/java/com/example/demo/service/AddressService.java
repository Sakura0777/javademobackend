package com.example.demo.service;


import com.example.demo.bean.Address;

import java.util.List;

public interface AddressService {
    public List<Address> selectAll();
    public Boolean insert(String name,String phone,String address);
    public Boolean update(Integer id,String name,String phone,String address);
    public Boolean delete(Integer id);
}
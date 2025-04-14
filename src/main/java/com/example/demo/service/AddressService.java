package com.example.demo.service;


import com.example.demo.bean.Address;
import com.example.demo.bean.SearchResponse;

import java.util.List;

public interface AddressService {
    public  Integer getAddressCounts();
    public List<Address> selectAll();
    public SearchResponse selectByPageNum(Integer start, Integer count);
    public Boolean insert(String name,String phone,String address);
    public Boolean update(Integer id,String name,String phone,String address);
    public Boolean delete(Integer id);
}
package com.example.demo.service;

import com.example.demo.bean.Address;
import com.example.demo.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> selectAll() {
        return addressMapper.selectAll();
    }

    @Override
    public Boolean insert(String name, String phone, String address) {
        return addressMapper.insert(name, phone, address);
    }
    @Override
    public Boolean update(Integer id,String name, String phone, String address) {
        return addressMapper.update(id,name, phone, address);
    }
    @Override
    public Boolean delete(Integer id) {
        return addressMapper.delete(id);
    }
}

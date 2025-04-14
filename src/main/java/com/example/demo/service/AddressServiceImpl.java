package com.example.demo.service;

import com.example.demo.bean.Address;
import com.example.demo.bean.SearchResponse;
import com.example.demo.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static utils.Validator.validatePhone;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public  Integer getAddressCounts(){return addressMapper.getAddressCounts();}
    @Override
    public List<Address> selectAll() {
        return addressMapper.selectAll();
    }
    @Override
    public SearchResponse selectByPageNum(Integer start, Integer count) {
        Integer counts = getAddressCounts();
        System.out.println("getAddressCounts"+counts);
        List<Address> list =  addressMapper.selectByPageNum(start,count);
        SearchResponse res = new SearchResponse();
        res.setCounts(getAddressCounts());
        res.setList(list);
        return res;

    }
    @Override
    public Boolean insert(String name, String phone, String address) {
        if(!(name instanceof String)){
            throw new IllegalArgumentException("名字输入格式必须为字符串");
        }
        if(name.length() < 2 ||name.length()>20){
            throw new IllegalArgumentException("名字输入长度必须为2-20之间");
        }
        if(!validatePhone(phone)){
            throw new IllegalArgumentException("手机号输入不合法");
        }
        return addressMapper.insert(name, phone, address);
    }
    @Override
    public Boolean update(Integer id,String name, String phone, String address) {
        if(!(name instanceof String)){
            throw new IllegalArgumentException("名字输入格式必须为字符串");
        }
        if(name.length() < 2 ||name.length()>20){
            throw new IllegalArgumentException("名字输入长度必须为2-20之间");
        }
        if(!validatePhone(phone)){
            throw new IllegalArgumentException("手机号输入不合法");
        }
        return addressMapper.update(id,name, phone, address);
    }
    @Override
    public Boolean delete(Integer id) {
        return addressMapper.delete(id);
    }
}

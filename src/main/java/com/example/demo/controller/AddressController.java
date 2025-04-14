package com.example.demo.controller;


import com.example.demo.bean.Address;
import com.example.demo.bean.SearchParams;
import com.example.demo.bean.SearchResponse;
import com.example.demo.service.AddressService;
import com.example.demo.service.AddressServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Resource
    private AddressService addressService = new AddressServiceImpl();

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public List<Address> selectAll() {
        List<Address> list = addressService.selectAll();
        return list;
    }
    @RequestMapping(value = "/selectByPageNum", method = RequestMethod.POST)
    public SearchResponse selectByPageNum(@RequestBody SearchParams obj) {
        System.out.println("selectByPageNum"+obj.getStart()+obj.getCount());
        SearchResponse res = addressService.selectByPageNum(obj.getStart(),obj.getCount());
        return res;
    }


    @PostMapping("insert")
    public Boolean insert(@RequestBody Address obj) {
        Boolean isSuccess = addressService.insert(obj.getName(), obj.getPhone(), obj.getAddress());
        return isSuccess;
    }
    @PostMapping("update")
    public Boolean update(@RequestBody Address obj) {
        Boolean isSuccess = addressService.update(obj.getId(),obj.getName(), obj.getPhone(), obj.getAddress());
        return isSuccess;
    }
    @PostMapping("delete")
    public Boolean delete(@RequestBody Address obj) {
        Boolean isSuccess = addressService.delete(obj.getId());
        return isSuccess;
    }
}
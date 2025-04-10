package com.example.demo.controller;


import com.example.demo.bean.Address;
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
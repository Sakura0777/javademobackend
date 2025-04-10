package com.example.demo.controller;


import com.example.demo.bean.Depart;
import com.example.demo.service.DepartService;
import com.example.demo.service.DepartServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/depart")
public class DepartController {
    @Resource
    private DepartService departService = new DepartServiceImpl();
//    @GetMapping("users")
//    等价于
//    @RequestMapping(value="/users",method=RequestMethod.GET)
    @GetMapping("selectAll")
    public List selectAll() {
        List list = departService.selectAll();
        return list;
    }

//    @RequestMapping(value = "/insert",method = RequestMethod.POST)
//@PostMapping("/submit")
//public ResponseEntity<String> handlePostRequest(@RequestParam("paramName") String paramValue) {
//    // 使用paramValue
//    return ResponseEntity.ok("参数值为: " + paramValue);
//}
    @PostMapping("insert")
    public Boolean insert(@RequestBody Depart obj) {
        System.out.println("DepartController"+obj);
//        System.out.println("DepartController----"+request.getParameter("name"));
        Boolean isSuccess = departService.insert(obj.getName(),obj.getLocation());
        return isSuccess;
    }
}
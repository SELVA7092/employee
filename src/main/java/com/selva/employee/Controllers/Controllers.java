package com.selva.employee.Controllers;

import com.selva.employee.Services.Servicescls;
import com.selva.employee.model.Empdetailss;
import com.selva.employee.model.Empdetailss;
import com.selva.employee.model.Login;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping()
public class Controllers {


   @Autowired
    public Servicescls ser;

//    @GetMapping
//    public String getapi(){
//    return "hello world";
//       }
//    @PostMapping("")
//    public String postapi(@RequestParam String name){
//        return "Hello "+name;
//    }

    @PostMapping("/Register")
    public String regis(@RequestBody Empdetailss det){
        return ser.createemp(det);
    }

    @GetMapping("/viewall")
    public List<Empdetailss> regis(){
        return ser.viewall();
    }

    @PutMapping("/update")
    public String updates(@RequestParam String name,@RequestBody Empdetailss det){
        return ser.ups(name,det);
    }

    @DeleteMapping("/delete")
    public String deletes(@RequestParam String name){
        return ser.del(name);
    }
    @PostMapping("/Login")
    public String log(@RequestBody Login log){
       return ser.login(log);
    }

}

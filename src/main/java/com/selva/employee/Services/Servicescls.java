package com.selva.employee.Services;

import com.selva.employee.Repository.Savedata;
import com.selva.employee.model.Empdetailss;
import com.selva.employee.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Servicescls {
    @Autowired
    public Savedata sav;

    public String createemp(Empdetailss det) {
        sav.save(det);
        return "data saved";
    }

    public List<Empdetailss> viewall() {

        return sav.findAll();
    }

    public String ups(String name, Empdetailss det) {
        Optional<Empdetailss> existingData = sav.findByEmpname(name);
        if (existingData.isPresent()) {
            existingData.get().setEmpname(det.getEmpname());
            existingData.get().setEmpgender(det.getEmpgender());
            existingData.get().setEmpphone(det.getEmpphone());
            existingData.get().setPass(det.getPass());
            sav.save(existingData.get());
            return "data updated.";
        } else {
            return "user not found.";
        }
    }
    public String del(String name) {
        sav.deleteByEmpname(name);
        return "user deleted.";
    }


    public String login(Login log) {
       Optional<Empdetailss> data =  sav.findByEmpname(log.getUsername());
        if(data.isPresent()){
             Empdetailss userdata=data.get();
            if(userdata.getPass().equals(log.getPass())){

               return "user loged";
           }else{
                return "password is nat correct";
            }
       }

        return "User is not found";
    }
}

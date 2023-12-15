package com.Centum1.CapEmployee.Controller;

import com.Centum1.CapEmployee.Model.Sherise;
import com.Centum1.CapEmployee.Service.Sheriseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/centum1")
public class SheriseController {
    @Autowired
    private Sheriseservice service;

    @PostMapping ("/newcandidate")

    public List<Sherise> saveEmployees(@RequestBody List<Sherise> candidates) {
        return service.savecandidates(candidates);
    }
    @GetMapping("/Can/{id}")
    public Sherise getEmployeeById(@PathVariable int id){
        return service.getCandidateById(id);
    }
    @GetMapping("/Cans")
    public List<Sherise> getCandidate(){
        return service.getCandidate();
    }
    @DeleteMapping("/Can/{id}")
    public String deleteCandidateById(int id){
        return service.deleteCandidateById(id);
    }


}
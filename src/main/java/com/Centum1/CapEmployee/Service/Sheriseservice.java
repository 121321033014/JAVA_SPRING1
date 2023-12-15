package com.Centum1.CapEmployee.Service;

import com.Centum1.CapEmployee.Model.Sherise;
import com.Centum1.CapEmployee.Repository.Sheriserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Sheriseservice {
    @Autowired
    private Sheriserepo repo;

    public List<Sherise> savecandidates(List<Sherise> candidates) {
        return repo.saveAll(candidates);
    }

    public Sherise getCandidateById(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Sherise> getCandidate() {
        return repo.findAll();
    }

    public String deleteCandidateById(int id) {
        repo.deleteById(id);
        return "candidate details deleted with id"+id;
    }
    }

    
package com.nova.skills.service;

import com.nova.skills.dao.ProgrammerRepository;
import com.nova.skills.model.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProgrammerService {

    private ProgrammerRepository programmerRepository;

    @Autowired
    public ProgrammerService(ProgrammerRepository programmerRepository) {
        this.programmerRepository = programmerRepository;
    }

    @Transactional
    public Programmer save(Programmer programmer){
        return programmerRepository.saveAndFlush(programmer);
    }

    public Optional<Programmer> findById(Long id){
        return programmerRepository.findById(id);
    }

    public List<Programmer> findAll(){
        return programmerRepository.findAll();
    }
}

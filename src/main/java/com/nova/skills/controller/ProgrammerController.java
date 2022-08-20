package com.nova.skills.controller;

import com.nova.skills.model.Programmer;
import com.nova.skills.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/programmers")
public class ProgrammerController {

    private ProgrammerService programmerService;

    @Autowired
    public ProgrammerController(ProgrammerService programmerService) {
        this.programmerService = programmerService;
    }

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(programmerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Programmer> byId = programmerService.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Programmer programmer){
        return ResponseEntity.ok(programmerService.save(programmer));
    }
}

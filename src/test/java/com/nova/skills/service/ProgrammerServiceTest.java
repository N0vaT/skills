package com.nova.skills.service;

import com.nova.skills.model.Language;
import com.nova.skills.model.Programmer;
import com.nova.skills.model.Skill;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ProgrammerServiceTest {

    @Autowired
    private ProgrammerService programmerService;

    @Test
    void save() {
        Programmer p = new Programmer();
        p.setName("Nova");
        Language l = new Language();
        l.setTitle("java");
        l.setDescription("god of java");
        Skill s1 = new Skill();
        s1.setTitle("Java");
        s1.setDescription("God of Java-2");
        l.addSkill(s1);
        p.addLanguage(l);
        programmerService.save(p);
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
        programmerService.findAll();
        log.info("ALL Programmers - {}",programmerService.findAll());
    }
}
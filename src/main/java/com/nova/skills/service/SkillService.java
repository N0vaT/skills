package com.nova.skills.service;

import com.nova.skills.dao.QuestionRepository;
import com.nova.skills.dao.SkillRepository;
import com.nova.skills.model.Question;
import com.nova.skills.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    private SkillRepository skillRepository;

    @Autowired
    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill save(Skill skill){
        return skillRepository.save(skill);
    }

    public Optional<Skill> findById(Long id){
        return skillRepository.findById(id);
    }

    public List<Skill> findAll(){
        return skillRepository.findAll();
    }
}

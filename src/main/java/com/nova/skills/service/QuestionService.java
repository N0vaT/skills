package com.nova.skills.service;

import com.nova.skills.dao.QuestionRepository;
import com.nova.skills.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question save(Question question){
        return questionRepository.save(question);
    }

    public Optional<Question> findById(Long id){
        return questionRepository.findById(id);
    }

    public List<Question> findAll(){
        return questionRepository.findAll();
    }
}

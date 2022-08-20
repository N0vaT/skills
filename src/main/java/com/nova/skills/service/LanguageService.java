package com.nova.skills.service;

import com.nova.skills.dao.LanguageRepository;
import com.nova.skills.model.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public List<Language> findAll() {
        return languageRepository.findAll();
    }

    public Optional<Language> findById(Long id) {
        return languageRepository.findById(id);
    }

    public Language save(Language language) {
        return languageRepository.save(language);
    }
}

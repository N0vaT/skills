package com.nova.skills.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "sk_programmer")
public class Programmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "programmer_id")
    private Long programmerId;

    @Column(name="programmer_name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="programmer_id")
    private List<Language> languageList = new ArrayList<>();


    public void addLanguage(Language language){
        this.languageList.add(language);
    }
}

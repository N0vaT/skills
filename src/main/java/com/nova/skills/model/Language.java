package com.nova.skills.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sk_language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Long languageId;

    @Column(name = "language_title")
    private String title;

    @Column(name = "language_description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="language_id")
    private List<Skill> skillList = new ArrayList<>();

    public void addSkill(Skill skill){
        this.skillList.add(skill);
    }

}

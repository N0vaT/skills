package com.nova.skills.model;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name = "sk_question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id;
    @Column(name = "question")
    private String question;
    @Column(name = "answer")
    private String answer;
}

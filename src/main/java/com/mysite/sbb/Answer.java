package com.mysite.sbb;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;// QUESTION_ID 칼럼

    @Column(columnDefinition = "TEXT")
    private String answer;
}

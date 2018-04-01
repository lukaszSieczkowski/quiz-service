package com.example.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class Record {
    @Id
    @Column(name = "id")
    protected Long id;
    @Column(name = "question")
    protected String question;
    @Column(name = "correct_answer")
    protected String correctAnswer;
    @Column(name = "first_incorrect_answer")
    protected String firstIncorrectAnswer;
    @Column(name = "second_incorrect_answer")
    protected String secondIncorrectAnswer;
    @Column(name = "third_incorrect_answer")
    protected String thirdIncorrectAnswer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getFirstIncorrectAnswer() {
        return firstIncorrectAnswer;
    }

    public void setFirstIncorrectAnswer(String firstIncorrectAnswer) {
        this.firstIncorrectAnswer = firstIncorrectAnswer;
    }

    public String getSecondIncorrectAnswer() {
        return secondIncorrectAnswer;
    }

    public void setSecondIncorrectAnswer(String secondIncorrectAnswer) {
        this.secondIncorrectAnswer = secondIncorrectAnswer;
    }

    public String getThirdIncorrectAnswer() {
        return thirdIncorrectAnswer;
    }

    public void setThirdIncorrectAnswer(String thirdIncorrectAnswer) {
        this.thirdIncorrectAnswer = thirdIncorrectAnswer;
    }
}

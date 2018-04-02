package com.example.controller;

import com.example.model.JavaBasicQuestion;
import com.example.repository.QuestionRepository;
import com.example.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    QuestionsService questionsService;

    @GetMapping("/")
    public List<JavaBasicQuestion> showAllQuestons() {
        return questionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<JavaBasicQuestion> showQuestionById(@PathVariable Long id) {
        return questionRepository.findById(id);
    }

    @GetMapping("/set")
    public List<JavaBasicQuestion> showFortyRandomQuestions() {
        return questionsService.getFortyQuestions();
    }
}
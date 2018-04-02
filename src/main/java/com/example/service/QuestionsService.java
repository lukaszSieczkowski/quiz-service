package com.example.service;

import com.example.model.JavaBasicQuestion;
import com.example.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

@Service
public class QuestionsService {
    @Autowired
    QuestionRepository questionRepository;

    public Set<Long> getFortyNumbers() {
        int maxLimitValue = questionRepository.findRecordsNumber();
        Random random = new Random();
        Set<Long> questionNumbers = new HashSet<>();
        for (int i = 0; i < 40; i++) {
            long selectedValue;
            do {
                selectedValue = (long) random.nextInt(maxLimitValue + 1);
            } while (questionNumbers.contains(selectedValue));
            questionNumbers.add(selectedValue);
        }
        return questionNumbers;
    }

    public List<JavaBasicQuestion> getFortyQuestions() {
        Set<Long> numbers = getFortyNumbers();
        List<JavaBasicQuestion> questionsList = questionRepository.findQuestion(numbers);
        return questionsList;
    }
}



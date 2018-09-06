package com.aconex.qaportal.service;

import com.aconex.qaportal.entity.Question;
import com.aconex.qaportal.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void addQuestion(Question question){
        questionRepository.save(question);
    }

    public List<Question> viewAllQuestion() {
        Iterable<Question> results = questionRepository.findAll();
        List<Question> questions = new ArrayList<>();
        for(Question ques : results){
            questions.add(ques);
        }
        return questions;
    }

}

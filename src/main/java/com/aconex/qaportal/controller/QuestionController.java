package com.aconex.qaportal.controller;

import com.aconex.qaportal.entity.Question;
import com.aconex.qaportal.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/questions", method = RequestMethod.POST)
    public void addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
    }

}

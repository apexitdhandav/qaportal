package com.aconex.qaportal.controller;

import com.aconex.qaportal.entity.Question;
import com.aconex.qaportal.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*").allowedOrigins("*");
            }
        };
    }

    @RequestMapping(value = "/questions", method = RequestMethod.POST)
    public void addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
    }

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    public List<Question> viewAllQuestion() {
        return questionService.viewAllQuestion();
    }

}

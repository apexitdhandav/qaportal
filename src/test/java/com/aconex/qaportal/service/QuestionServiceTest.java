package com.aconex.qaportal.service;

import com.aconex.qaportal.entity.Question;
import com.aconex.qaportal.repositories.QuestionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionServiceTest{

    @MockBean
    private QuestionRepository mockRepository;

    @Autowired
    private QuestionService questionService;

    @Test
    public void testViewAllQuestionSingle(){

        List<Question> mockdata= new ArrayList<Question> ();
        mockdata.add(new Question(  1, "Dummy Question"));
        Mockito.doReturn(mockdata).when(mockRepository).findAll();
        assertEquals(mockdata,questionService.viewAllQuestion());
    }

    @Test
    public void testViewAllQuestionMultiple(){

        List<Question> mockdata= new ArrayList<Question> ();
        mockdata.add(new Question(  1, "Dummy Question 1"));
        mockdata.add(new Question(  2, "Dummy Question 2"));

        Mockito.doReturn(mockdata).when(mockRepository).findAll();
        assertEquals(mockdata,questionService.viewAllQuestion());
    }

}

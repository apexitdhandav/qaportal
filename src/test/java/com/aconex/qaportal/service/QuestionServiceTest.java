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

import java.util.*;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionServiceTest{

    @MockBean
    private QuestionRepository mockRepository;

    @Autowired
    private QuestionService questionService;

    @Test
    public void testViewAllQuestion(){

        List<Question> mockdata= new ArrayList<Question> ();
        mockdata.add(new Question(  1, "Dummy Question"));

        Mockito.doReturn(mockdata).when(mockRepository).findAll();
       // when(mockRepository.findAll()).thenReturn(new Question(  1, "Dummy Question") );
      // Question sample = new Question(1,"Dummy Question");
       assertEquals(mockdata,questionService.viewAllQuestion());
    }

}
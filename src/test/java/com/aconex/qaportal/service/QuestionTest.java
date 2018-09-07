package com.aconex.qaportal.service;

import com.aconex.qaportal.entity.Question;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionTest {

    @Test
    public void testQuestion(){

        Question tempQuestion = new  Question(  1, "Dummy Question 1");

        assertEquals(1, tempQuestion.getId());
        assertEquals("Dummy Question 1", tempQuestion.getQuestion());
    }

    @Test
    public void testSetId(){

        Question tempQuestion = new  Question(  1, "Dummy Question 1");
        tempQuestion.setId(2);
        assertEquals(2,tempQuestion.getId());

    }

    @Test
    public void testSetQuestion(){

        Question tempQuestion = new  Question(  1, "Dummy Question 1");
        tempQuestion.setQuestion("New Question");
        assertEquals("New Question", tempQuestion.getQuestion());

    }

}

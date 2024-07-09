package com.quiz.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entities.Question;

//automatic implementation of the interface
// @FeignClient(url = "http://localhost:8082", value = "Question-Client")
@FeignClient(name = "QuestionService")
public interface QuestionClient {
    @GetMapping("/question/quiz/{id}")
    List<Question> getQuestionsByQuiz(@PathVariable Long id);
}

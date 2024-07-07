package com.question.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    // create
    @PostMapping
    public Question create(@RequestBody Question question) {
        return questionService.create(question);
    }

    // get all
    @GetMapping
    public List<Question> get() {
        return questionService.get();
    }

    // get one
    @GetMapping("/{id}")
    public Question get(@PathVariable Long id) {
        return questionService.get(id);
    }

    // get questions by specific quiz
    @GetMapping("/quiz/{id}")
    public List<Question> getQuestionsByQuizId(@PathVariable Long id) {
        return questionService.getQuestionsByQuizId(id);
    }
}

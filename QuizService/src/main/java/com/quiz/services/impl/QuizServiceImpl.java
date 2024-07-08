package com.quiz.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepository;
import com.quiz.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
    }

}

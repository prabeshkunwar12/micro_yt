package com.question.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}

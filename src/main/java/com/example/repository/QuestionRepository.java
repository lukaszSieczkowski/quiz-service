package com.example.repository;

import com.example.model.JavaBasicQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends CrudRepository<JavaBasicQuestion, Long> {

    List<JavaBasicQuestion> findAll();

    Optional<JavaBasicQuestion> findById(Long id);
}

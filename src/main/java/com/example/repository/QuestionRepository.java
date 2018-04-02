package com.example.repository;

import com.example.model.JavaBasicQuestion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface QuestionRepository extends CrudRepository<JavaBasicQuestion, Long> {

    List<JavaBasicQuestion> findAll();

    Optional<JavaBasicQuestion> findById(Long id);

    @Query(value = "SELECT count(*) FROM java_basic_questions_pl", nativeQuery = true)
    Integer findRecordsNumber();

    @Query("select u from JavaBasicQuestion u where u.id in :ids")
    List<JavaBasicQuestion> findQuestion(@Param("ids") Set<Long> ids);
}

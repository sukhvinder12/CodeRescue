package com.coderescue.CodeRescue.tag;

import com.coderescue.CodeRescue.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
    public Tag findByName(String name);
    public List<Question> findAllByQuestions_id(Integer id);
}

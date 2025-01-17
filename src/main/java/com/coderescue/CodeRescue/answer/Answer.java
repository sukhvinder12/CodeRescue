package com.coderescue.CodeRescue.answer;

import com.coderescue.CodeRescue.question.Question;
import com.coderescue.CodeRescue.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 2048)
    private String body;
    private Integer upvotes;
    private Boolean isAccepted;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @CreationTimestamp
    private Date publicationDateTime;
    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;
}

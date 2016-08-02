package ro.agitman.onexam.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by d-uu31cq on 07.07.2016.
 */
@Entity
@Table(name = "answers")
public class ExamItemAnswer {

    private Long id;
    private Boolean correct;
    private String value;
    private ExamItem item;

    public ExamItemAnswer(Long id) {
        this.id = id;
    }

    public ExamItemAnswer() {
    }

    @Override
    public String toString() {
        return "ExamItemAnswer{" +
                "id=" + id +
                ", correct=" + correct +
                ", value='" + value + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @ManyToOne
    @JoinColumn(name = "item")
    public ExamItem getItem() {
        return item;
    }

    public void setItem(ExamItem item) {
        this.item = item;
    }
}

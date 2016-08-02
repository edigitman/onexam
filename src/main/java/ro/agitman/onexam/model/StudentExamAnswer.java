package ro.agitman.onexam.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by edi on 7/7/2016.
 */
@Entity
@Table(name = "studentanswer")
public class StudentExamAnswer extends AbstractModel {

    private Long id;
    private StudentExamInstance studentExamInstance;
    private ExamItem examItem;
    private User student;
    private String value;
    private Boolean correct;
    private Boolean reviewed;
    private BigDecimal points;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne
    public StudentExamInstance getStudentExamInstance() {
        return studentExamInstance;
    }

    public void setStudentExamInstance(StudentExamInstance studentExamInstance) {
        this.studentExamInstance = studentExamInstance;
    }

    @OneToOne
    public ExamItem getExamItem() {
        return examItem;
    }

    public void setExamItem(ExamItem examItem) {
        this.examItem = examItem;
    }

    @ManyToOne
    @JoinColumn(name = "student")
    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Boolean getReviewed() {
        return reviewed;
    }

    public void setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
    }

    public BigDecimal getPoints() {
        return points;
    }

    public void setPoints(BigDecimal points) {
        this.points = points;
    }
}

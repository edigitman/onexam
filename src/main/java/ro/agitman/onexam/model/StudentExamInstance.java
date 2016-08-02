package ro.agitman.onexam.model;

import ro.agitman.onexam.model.enums.StudentExamInstanceStatusEnum;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by d-uu31cq on 07.07.2016.
 */
@Entity
@Table(name = "student_exam")
public class StudentExamInstance extends AbstractModel {

    private Long id;
    private ExamInstance examInstance;
    private User student;
    private StudentExamInstanceStatusEnum status;
    private Timestamp datestarted;
    private Timestamp dateupdated;
    private BigDecimal totalPoints;
    private Integer itemsAnswered;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne
    public ExamInstance getExamInstance() {
        return examInstance;
    }

    public void setExamInstance(ExamInstance examInstance) {
        this.examInstance = examInstance;
    }

    @ManyToOne
    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    @Enumerated(EnumType.STRING)
    public StudentExamInstanceStatusEnum getStatus() {
        return status;
    }

    public void setStatus(StudentExamInstanceStatusEnum status) {
        this.status = status;
    }

    public Timestamp getDatestarted() {
        return datestarted;
    }

    public void setDatestarted(Timestamp datecreated) {
        this.datestarted = datecreated;
    }

    public Timestamp getDateupdated() {
        return dateupdated;
    }

    public void setDateupdated(Timestamp dateupdated) {
        this.dateupdated = dateupdated;
    }

    public BigDecimal getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(BigDecimal totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Integer getItemsAnswered() {
        return itemsAnswered;
    }

    public void setItemsAnswered(Integer itemsAnswered) {
        this.itemsAnswered = itemsAnswered;
    }
}

package ro.agitman.onexam.model;

import ro.agitman.onexam.model.enums.ExamInstanceStatusEnum;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by d-uu31cq on 07.07.2016.
 */
@Entity
@Table(name = "examInstances")
public class ExamInstance extends AbstractModel {

    private Long id;
    private String name;
    private ExamInstanceStatusEnum status;
    private Timestamp date;
    private Exam exam;
    private Group group;
    private Boolean autoCorrect;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Enumerated(EnumType.STRING)
    public ExamInstanceStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ExamInstanceStatusEnum status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @ManyToOne
    @JoinColumn(name = "exam")
    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @ManyToOne
    @JoinColumn(name = "group")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Boolean getAutoCorrect() {
        return autoCorrect;
    }

    public void setAutoCorrect(Boolean autoCorrect) {
        this.autoCorrect = autoCorrect;
    }
}

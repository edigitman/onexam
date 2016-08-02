package ro.agitman.onexam.model;

import ro.agitman.onexam.model.enums.ItemDifficulty;
import ro.agitman.onexam.model.enums.ItemType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by d-uu31cq on 07.07.2016.
 */
@Entity
@Table(name = "items")
public class ExamItem extends AbstractModel {

    private Long id;
    private String assertion;
    private ItemDifficulty difficulty;
    private BigDecimal points;
    private ItemType type;
    private Exam exam;
    private List<ExamItemAnswer> answers;
    private Integer order;

    public ExamItem(Long examId) {
        this.id = examId;
    }

    public ExamItem() {
    }

    @Override
    public String toString() {
        return "ExamItem{" +
                "id=" + id +
                ", assertion='" + assertion + '\'' +
                ", type=" + type +
                ", examid=" + exam +
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

    public String getAssertion() {
        return assertion;
    }

    public void setAssertion(String assertion) {
        this.assertion = assertion;
    }

    public ItemDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(ItemDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    public BigDecimal getPoints() {
        return points;
    }

    public void setPoints(BigDecimal points) {
        this.points = points;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @ManyToOne
    @JoinColumn(name = "exam")
    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @OneToMany(mappedBy = "item")
    public List<ExamItemAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<ExamItemAnswer> answers) {
        this.answers = answers;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}

package ro.agitman.onexam.model;


import ro.agitman.onexam.model.enums.ExamDifficultyEnum;
import ro.agitman.onexam.model.enums.ItemOrderEnum;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by d-uu31cq on 07.07.2016.
 */
@Entity
@Table(name = "exams")
public class Exam extends AbstractModel{

    private Long id;
    private String name;
    private User owner;
    private ExamDifficultyEnum difficulty;
    private BigDecimal points;
    private List<ExamItem> items;
    private ItemOrderEnum itemOrderEnum;

    public Exam() {
    }

    public Exam(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "owner")
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Enumerated(EnumType.STRING)
    public ExamDifficultyEnum getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(ExamDifficultyEnum difficulty) {
        this.difficulty = difficulty;
    }

    public BigDecimal getPoints() {
        return points;
    }

    public void setPoints(BigDecimal points) {
        this.points = points;
    }

    @OneToMany(mappedBy = "exam")
    public List<ExamItem> getItems() {
        return items;
    }

    public void setItems(List<ExamItem> items) {
        this.items = items;
    }

    @Enumerated(EnumType.STRING)
    public ItemOrderEnum getItemOrderEnum() {
        return itemOrderEnum;
    }

    public void setItemOrderEnum(ItemOrderEnum itemOrderEnum) {
        this.itemOrderEnum = itemOrderEnum;
    }
}

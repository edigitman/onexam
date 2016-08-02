package ro.agitman.onexam.model.enums;

/**
 * Created by d-uu31cq on 02.08.2016.
 */
public enum ExamDifficultyEnum {

    EASY("usor"), MEDIUM("mediu"), DIFFICULT("dificil");

    private String name;

    ExamDifficultyEnum(String name) {
        this.name = name;
    }
}

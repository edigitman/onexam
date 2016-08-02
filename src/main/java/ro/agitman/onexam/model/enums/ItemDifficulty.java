package ro.agitman.onexam.model.enums;

/**
 * Created by d-uu31cq on 02.08.2016.
 */
public enum ItemDifficulty {

    EASY("usor"), MEDIUM("mediu"), DIFFICULT("dificil");

    private String name;

    ItemDifficulty(String name) {
        this.name = name;
    }
}

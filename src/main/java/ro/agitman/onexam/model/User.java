package ro.agitman.onexam.model;

import javax.persistence.*;

/**
 * Created by edi on 7/30/16.
 */
@Entity
@Table(name = "users")
@NamedQueries({@NamedQuery(name = User.FIND_BY_EMAIL, query = "select u from User u where u.email = :email")
        //,
//        @NamedQuery(name = User.FIND_BY_TOKEN, query = "select u from User u where u.regToken = :token"),
//        @NamedQuery(name = User.FIND_BY_EMAIL_TOKEN, query = "select u from User u where u.regToken = :token and u.email = :email")
})

public class User extends AbstractModel {

    public static final String FIND_BY_EMAIL = "User.findUserByEmail";
    public static final String FIND_BY_TOKEN = "User.findUserByToken";
    public static final String FIND_BY_EMAIL_TOKEN = "User.findUserByEmailAndToken";

    private Long id;
    private String email;
    private String password;
    private String name;
    private String role;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

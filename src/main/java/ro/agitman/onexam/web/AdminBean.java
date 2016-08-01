package ro.agitman.onexam.web;

import ro.agitman.onexam.facade.UserService;
import ro.agitman.onexam.model.User;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by edi on 8/1/16.
 */
@Named
@ViewScoped
public class AdminBean extends AbstractMB {

    @EJB
    private UserService userService;

    private List<User> userList = null;

    public List<User> getUserList() {
        if (userList == null)
            userList = userService.findAll();

        return userList;
    }
}

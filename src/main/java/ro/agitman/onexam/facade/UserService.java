package ro.agitman.onexam.facade;

import ro.agitman.onexam.model.User;

import javax.ejb.Local;

/**
 * Created by edi on 7/30/16.
 */
@Local
public interface UserService {

    User findUserByEmail(String email);

}

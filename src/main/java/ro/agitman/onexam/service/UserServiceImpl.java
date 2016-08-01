package ro.agitman.onexam.service;

import ro.agitman.onexam.dao.DataAccessService;
import ro.agitman.onexam.facade.UserService;
import ro.agitman.onexam.model.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by edi on 7/30/16.
 */
@Stateless
public class UserServiceImpl implements UserService {


    @EJB
    private DataAccessService service;

    @Override
    public User findUserByEmail(String email) {
        Map<String, Object> map = new HashMap<>();
        map.put("email", email);

        List<User> users = service.findWithNamedQuery(User.FIND_BY_EMAIL, map);

        return users.isEmpty() ? null : users.get(0);
    }
}

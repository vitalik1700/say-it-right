package km81m.say_it_right.logic.dao;

import km81m.say_it_right.logic.entities.User;

import java.util.List;

/**
 * User: alexeydushenin
 * Date: 11/4/13
 * Time: 8:24 PM
 */
public interface UserDAO {

    String TABLE = "user_tb";
    String ID = "_id";
    String NAME = "user_name";

    public User save(User user);
    public List<User> getAllUsers();
    public void delete(User user);
    public void clear();
    public User getUser(int id);
}

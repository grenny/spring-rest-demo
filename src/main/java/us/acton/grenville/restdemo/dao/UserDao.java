package us.acton.grenville.restdemo.dao;

import us.acton.grenville.restdemo.entity.User;

public interface UserDao {
    User getUser(String username);
    void save(User user);
}

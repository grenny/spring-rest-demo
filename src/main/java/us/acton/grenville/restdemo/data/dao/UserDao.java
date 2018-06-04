package us.acton.grenville.restdemo.data.dao;

import us.acton.grenville.restdemo.data.entity.User;

public interface UserDao {
    User getUser(String username);
    void save(User user);
}

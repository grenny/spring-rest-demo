package us.acton.grenville.restdemo.data.dao;

import us.acton.grenville.restdemo.data.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class JpaUseDao implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public User getUser(String username) {
        return em.find(User.class, username);
    }

    @Override
    @Transactional
    public void save(User user) {
        em.persist(user);
    }
}

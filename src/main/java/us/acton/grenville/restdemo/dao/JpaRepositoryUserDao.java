package us.acton.grenville.restdemo.dao;

import org.springframework.stereotype.Repository;
import us.acton.grenville.restdemo.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class JpaRepositoryUserDao implements UserDao {

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

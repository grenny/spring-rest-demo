package us.acton.grenville.restdemo.data.dao.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import us.acton.grenville.restdemo.data.dao.UserDao;
import us.acton.grenville.restdemo.data.entity.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUserDao implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcUserDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public User getUser(String username) {

        return jdbcTemplate.queryForObject("select * from users where username = ?",
                new Object[]{username},
                new UserRowMapper());
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into users (" +
                "username, password, born_date, email, last_name, name, user_type, tel) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?)",
                user.getUsername(), user.getPassword(), user.getBornDate(), user.getEmail(), user.getLastName(),
                user.getName(), user.getUserType(), user.getTel());
    }

    private static class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            final User user = new User();
            user.setUsername(resultSet.getString("username"));
            user.setBornDate(resultSet.getDate("born_date"));
            user.setEmail(resultSet.getString("email"));
            user.setLastName(resultSet.getString("last_name"));
            user.setName(resultSet.getString("name"));
            user.setUserType(resultSet.getInt("user_type"));
            user.setTel(resultSet.getString("tel"));
            return user;
        }
    }
}

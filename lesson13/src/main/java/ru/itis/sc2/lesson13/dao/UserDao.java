package ru.itis.sc2.lesson13.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.itis.sc2.lesson13.models.User;

@Component
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    UserRowMapper urm = new UserRowMapper();
    public User find(Integer id) {
        String sqlQuery = "SELECT * FROM \"user\" WHERE id = ?";
        Object[] params = {id};
        User u = jdbcTemplate.queryForObject(
                sqlQuery, params, urm);
        return u;
    }

    public User save(User user) {
        Object[] params = {user.username, user.password};
        Integer id = jdbcTemplate.queryForObject(
                "INSERT INTO \"user\" " +
                "(username, password) " +
                "VALUES (?, ?) RETURNING id", params,
                Integer.class);
        user.id = id;
        return user;
    }
}









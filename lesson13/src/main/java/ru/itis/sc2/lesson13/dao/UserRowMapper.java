package ru.itis.sc2.lesson13.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.itis.sc2.lesson13.models.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User u = new User();
        u.id = rs.getInt("id");
        u.username = rs.getString("username");
        u.password = rs.getString("password");
        return u;
    }
}

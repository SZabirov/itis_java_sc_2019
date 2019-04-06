package com.companny.dao;

import com.companny.models.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PollDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    PollRowMapper pollRowMapper =
            new PollRowMapper();

    public List<Poll> findAll() {
        String sqlQuery = "SELECT * FROM poll " +
                "ORDER BY id";
        List<Poll> pollList =
        jdbcTemplate.query(sqlQuery, pollRowMapper);
        return pollList;
    }
}

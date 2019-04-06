package com.companny.dao;

import com.companny.models.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OptionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    OptionRowMapper optionRowMapper =
            new OptionRowMapper();

    public List<Option> findOptionsByPollId(Integer pollId) {
        String sqlQuery = "SELECT * FROM option " +
                "WHERE poll_id = ?";
        Object[] parameters = {pollId};
        List<Option> options = jdbcTemplate.query(
                sqlQuery, parameters, optionRowMapper);
        return options;
    }

    public void addVote(Integer optionId) {
        String sqlQuery = "UPDATE option SET votes = votes + 1 " +
                "WHERE id = ?;";
        Object[] params = {optionId};
        jdbcTemplate.update(sqlQuery, params);
    }
}

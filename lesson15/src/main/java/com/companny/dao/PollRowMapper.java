package com.companny.dao;

import com.companny.models.Poll;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PollRowMapper implements RowMapper<Poll> {
    @Override
    public Poll mapRow(ResultSet rs, int rowNum) throws SQLException {
        Poll p = new Poll();
        p.setId(rs.getInt("id"));
        p.setTitle(rs.getString("title"));
        return p;
    }
}

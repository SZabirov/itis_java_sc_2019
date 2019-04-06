package com.companny.dao;

import com.companny.models.Option;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OptionRowMapper implements RowMapper<Option> {
    @Override
    public Option mapRow(ResultSet rs, int rowNum) throws SQLException {
        Option o = new Option();
        o.setId(rs.getInt("id"));
        o.setText(rs.getString("text"));
        o.setVotes(rs.getInt("votes"));
        return o;
    }
}

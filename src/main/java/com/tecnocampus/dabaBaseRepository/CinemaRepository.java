package com.tecnocampus.dabaBaseRepository;

import org.springframework.jdbc.core.JdbcOperations;

/**
 * Created by vil883 on 06/10/2016.
 */
public class CinemaRepository {

    private JdbcOperations jdbcOperations;

    public CinemaRepository (JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

   /* public Iterable<Cinema> findAll() {
        return jdbcOperations.query("Select * from note_lab", new CinemaRepository.CinemaMapper());
    }



        @Override
        public Cinema mapRow(ResultSet resultSet, int i) throws SQLException {
            return new CinemaBuilder().setTitle(resultSet.getString("title"))
                    .setContent(resultSet.getString("content")).setTime(resultSet.getTimestamp("date_creation").toLocalDateTime())
                    .setTimeEdit(resultSet.getTimestamp("date_edit").toLocalDateTime())
                    .createNoteLab();
        }
    }*/


}

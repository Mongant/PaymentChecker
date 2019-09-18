package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class PayCheckerRepository {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    String updateSql = "update TICKET.PAYMENT set STATUS = '?' where REF = '?';";

    @Bean
    public void updateStatusPay(String ref, String status) {
        jdbcTemplate.update(updateSql, status, ref);
    }

}

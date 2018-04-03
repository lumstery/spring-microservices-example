package com.lumstery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.HSQL;

@Configuration
public class UserMicroServiceConfig {
    @Bean
    public DataSource testDataSource() {
        return new EmbeddedDatabaseBuilder().setType(HSQL).build();
    }
}

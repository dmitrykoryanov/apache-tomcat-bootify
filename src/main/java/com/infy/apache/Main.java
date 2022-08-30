package com.infy.apache;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    @Configuration
    // @SpringBootApplication
    @Import(DefaultConfig.class) // == @SpringBootApplication
    public static class MyAppConfig {

    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DefaultConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);

        try (Connection connection = dataSource.getConnection()) {
            System.out.println("======>>> connection.isValid(5000)=" + connection.isValid(5000));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

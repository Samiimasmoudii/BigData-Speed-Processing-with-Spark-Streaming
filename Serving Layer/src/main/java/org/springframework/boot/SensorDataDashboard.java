package org.springframework.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@EnableScheduling
@EnableCassandraRepositories(basePackages = "org.springframework.boot.repository")
public class SensorDataDashboard  {
    public static void main(String[] args) {
        SpringApplication.run(SensorDataDashboard.class, args);
    }
}

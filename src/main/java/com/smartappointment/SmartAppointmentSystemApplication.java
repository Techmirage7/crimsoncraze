package com.smartappointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.smartappointment", "com.smartappointment.controller"})
@EntityScan("com.smartappointment.model")
@EnableJpaRepositories("com.smartappointment.repository")
public class SmartAppointmentSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartAppointmentSystemApplication.class, args);
    }
}
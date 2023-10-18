package com.luvina.assignment;

import com.luvina.assignment.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class LuvinaAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuvinaAssignmentApplication.class, args);
    }

}

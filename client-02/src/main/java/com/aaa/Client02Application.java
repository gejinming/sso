package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true )
@SpringBootApplication
public class Client02Application {

    public static void main(String[] args) {
        SpringApplication.run(Client02Application.class, args);
    }

}

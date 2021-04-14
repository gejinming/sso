package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @Description：
 * @Author：GJM
 * @Date：2021/4/13 4:26 下午
 */
@SpringBootApplication
@EnableOAuth2Sso
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true )
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

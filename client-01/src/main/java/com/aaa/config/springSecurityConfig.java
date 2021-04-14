package com.aaa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description：
 * @Author：GJM
 * @Date：2021/4/14 11:34 上午
 */
@EnableOAuth2Sso
@Configuration
public class springSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    MyAccessDeniedHandler myAccessDeniedHandler;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
                http.authorizeRequests()
                        .antMatchers("/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .cors()
                .and()
                .csrf().disable();
                http.exceptionHandling().accessDeniedHandler(myAccessDeniedHandler);

    }

}

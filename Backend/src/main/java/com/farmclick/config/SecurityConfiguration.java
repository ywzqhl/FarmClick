package com.farmclick.config;

import com.farmclick.security.JwtFilter;
import com.farmclick.security.UserAuthorities;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().permitAll();
//                .antMatchers("/api/user").hasRole(UserAuthorities.USER.name())
//                .antMatchers("/api/plant").hasRole(UserAuthorities.ADMIN.name())
//                .antMatchers("/api/login").permitAll()
//                .and()
//                .addFilter(new JwtFilter(authenticationManager()))
//                .csrf().disable();
    }


}

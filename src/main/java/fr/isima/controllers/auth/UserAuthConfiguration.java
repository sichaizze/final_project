package fr.isima.controllers.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.http.HttpSession;

@Configuration
public class UserAuthConfiguration {


    @Bean
    @SessionScope
    @Autowired
    public User user(HttpSession session) {
        return (User) session.getAttribute("user");
    }
}

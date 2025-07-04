package com.SpringSecurity.Spring_Security.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        var user1 = User.withUsername("lokesh")
                .password(passwordEncoder().encode("Lokesh@2004"))
                .roles("USER")
                .build();

        var admin = User.withUsername("admin")
                .password(passwordEncoder().encode("Loki@123"))
                .roles("ADMIN")
                .build();

        var Public1 = User.withUsername("MDU")
                .password(passwordEncoder().encode("MDU@123"))
                .roles("PUBLIC")
                .build();


        return new InMemoryUserDetailsManager(user1, admin,Public1);

    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/").hasRole("PUBLIC")
                        .requestMatchers("/user").hasRole("USER")
                        .requestMatchers("/admin").hasRole("ADMIN")
                        .anyRequest().denyAll()
                )
                .formLogin(Customizer.withDefaults());
        return http.build();
    }


}

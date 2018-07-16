package com.example.demo;

import com.example.demo.repository.MyTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    MyTokenRepository myTokenRepository;


}


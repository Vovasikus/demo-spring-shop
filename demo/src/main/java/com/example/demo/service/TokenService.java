package com.example.demo.service;

import com.example.demo.model.PersistentLogins;
import com.example.demo.repository.MyTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.stereotype.Service;


import java.util.Date;

@Service
public class TokenService {

    @Autowired
    MyTokenRepository myTokenRepository;


    @Override
    public void createNewToken(PersistentRememberMeToken persistentRememberMeToken) {
        PersistentLogins persistentLogins = new PersistentLogins();
        persistentLogins.setUsername(persistentRememberMeToken.getUsername());
        persistentLogins.setSeries(persistentRememberMeToken.getSeries());
        persistentLogins.setToken(persistentRememberMeToken.getTokenValue());
        persistentLogins.setLastUsed(persistentRememberMeToken.getDate());
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String s) {
        return null;
    }

    @Override
    public void removeUserTokens(String s) {

    }

    @Override
    public void updateToken(String s, String s1, Date date) {

    }
}

package com.example.demo.repository;

import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface MyTokenRepository extends PersistentTokenRepository {
    @Override
    void createNewToken(PersistentRememberMeToken persistentRememberMeToken);

    @Override
    PersistentRememberMeToken getTokenForSeries(String s);

    @Override
    void removeUserTokens(String s);

    @Override
    void updateToken(String s, String s1, Date date);
}

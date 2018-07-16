package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.MyTokenRepository;
import com.example.demo.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    MyUserRepository myUserRepository;

    @Autowired
    MyTokenRepository myTokenRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetails loadedUsers;

        try {
            User client = myUserRepository.findByUsername(username);
            loadedUsers = new org.
                    springframework.
                    security.
                    core.
                    userdetails.
                    User(client.getName(),client.getPassword(), client.getRoles());
        } catch (Exception repositoryProblem) {throw new InternalAuthenticationServiceException(repositoryProblem.getMessage(), repositoryProblem);
        }
        return loadedUsers;
    }
}

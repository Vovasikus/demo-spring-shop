package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.repository.MyUserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/users")
public class MyController {

    @Autowired
    UserService userService;

    @Autowired
    MyUserRepository myUserRepository;
   /*@GetMapping("/u")
    public User ShowMe() {
        User user = User.builder().id(1L).name("uasya").password("123").build();
        System.out.println(user.toString());
        return user;
    }*/

    /*@GetMapping("/status")
    public HttpStatus giveStatus() {
        return HttpStatus.FORBIDDEN;
    }*/

    /*@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> loginUser(@RequestParam("username") String userName,
                                       @RequestParam("password") String password,
                                       HttpServletRequest request,
                                       HttpServletResponse responseG){

        User user = userService.saveUser(User.builder().build());
        if (user != null){
            if (new BCryptPasswordEncoder().matches(password, user.getPassword())){
                Authentication auth = new UsernamePasswordAuthenticationToken(user, null, null);
                SecurityContextHolder.getContext().setAuthentication(auth);
                return new ResponseEntity<>(user, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);*/
    }
}

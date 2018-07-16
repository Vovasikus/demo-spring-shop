package com.example.demo.model;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;


import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username")
    private String name;

    @Column(name = "password")
    private String password;

    @ManyToMany
    @JoinTable(name = "users_roles",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
   public Set<Role> roles;

   public Set<Role> getRoles() {
       return roles;
   }


  /* @OneToOne
   @JoinTable(name = "persistent_logins",
   joinColumns = {@JoinColumn(name = "username")},
   inverseJoinColumns = {@JoinColumn(name = "username")})
   public PersistentRememberMeToken getToken(String s){

   } */
}

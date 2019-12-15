package com.trustmeenglish.core.model;


import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name  = "users")
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String email;
    private  String password;


}

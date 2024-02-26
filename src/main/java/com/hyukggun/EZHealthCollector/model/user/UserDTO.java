package com.hyukggun.EZHealthCollector.model.user;

import lombok.Getter;

@Getter
public class UserDTO {
    private String email;
    private String password;
    private int age;   

    public UserDTO(String email, String password, int age) {
        this.email = email;
        this.password = password;
        this.age = age;
    }
}

package com.example.jwt.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class MyUserResponseDto {

    private Long id;
    private String name;
    private String mail;
    private String password;

}

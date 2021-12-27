package com.example.jwt.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Valid
@Getter
@Setter
public class MyUserRequestDto {

    @NotNull
    private String name;
    @NotNull
    private String mail;

    @NotNull
    @Size(min = 5)
    private String password;



}

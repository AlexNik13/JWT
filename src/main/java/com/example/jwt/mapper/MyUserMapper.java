package com.example.jwt.mapper;

import com.example.jwt.dto.MyUserResponseDto;
import com.example.jwt.model.MyUser;

import java.util.List;
import java.util.stream.Collectors;

public class MyUserMapper {

    public static MyUserResponseDto toMyUserResponseDto(MyUser user){
        MyUserResponseDto dto = new MyUserResponseDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setMail(user.getMail());
        dto.setPassword(user.getPassword());
        return dto;
    }

    public static List<MyUserResponseDto>  toAllMyUserResponseDto(List<MyUser> users){
        return users.stream().map(MyUserMapper::toMyUserResponseDto).collect(Collectors.toList());
    }
    
}

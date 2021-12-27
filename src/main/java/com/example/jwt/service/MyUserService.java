package com.example.jwt.service;

import com.example.jwt.dto.MyUserRequestDto;
import com.example.jwt.model.MyUser;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MyUserService {
    MyUser createMyUser(MyUserRequestDto dto);

    MyUser saveMyUser(MyUser user);

    List<MyUser> getAllMyUsers();

    MyUser getMyUserId(Long myUserId);
}

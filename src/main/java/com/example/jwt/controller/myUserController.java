package com.example.jwt.controller;


import com.example.jwt.dto.MyUserRequestDto;
import com.example.jwt.dto.MyUserResponseDto;
import com.example.jwt.mapper.MyUserMapper;
import com.example.jwt.model.MyUser;
import com.example.jwt.service.MyUserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class myUserController {

    private final MyUserService userService;

    public myUserController(MyUserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public MyUserResponseDto createMyUser(@Valid @RequestBody MyUserRequestDto dto){
        MyUser user = userService.createMyUser(dto);
        user = userService.saveMyUser(user);
        return MyUserMapper.toMyUserResponseDto(user);
    }
    
    @GetMapping()
    public List<MyUserResponseDto>  getAllMyUsers(){
        List<MyUser> users = userService.getAllMyUsers();
        return MyUserMapper.toAllMyUserResponseDto(users);
    }

    @GetMapping("/{myUserId}")
    public MyUserResponseDto getMyUser(@PathVariable Long myUserId){
        MyUser user = userService.getMyUserId(myUserId);
        return MyUserMapper.toMyUserResponseDto(user);
    }
}

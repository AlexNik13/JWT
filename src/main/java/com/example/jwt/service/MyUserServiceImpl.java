package com.example.jwt.service;

import com.example.jwt.dto.MyUserRequestDto;
import com.example.jwt.model.MyUser;
import com.example.jwt.repository.MyUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class MyUserServiceImpl implements MyUserService{

    private final MyUserRepository myUserRepository;

    public MyUserServiceImpl(MyUserRepository myUserRepository) {
        this.myUserRepository = myUserRepository;
    }


    @Override
    public MyUser createMyUser(MyUserRequestDto dto) {
        MyUser user = new MyUser();
        user.setName(dto.getName());
        user.setMail(dto.getMail());
        user.setPassword(dto.getPassword());

        return user;
    }

    @Override
    public MyUser saveMyUser(MyUser user) {
        user = myUserRepository.save(user);
        System.out.println(1);
        return user;
    }

    @Override
    public List<MyUser> getAllMyUsers() {
        List<MyUser> users = myUserRepository.findAll();
        return null;
    }

    @Override
    public MyUser getMyUserId(Long myUserId) {
        MyUser user = myUserRepository.findById(myUserId).orElseThrow(
                NoSuchElementException::new
        );
        return user;
    }

}

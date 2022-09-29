package com.example.travelvn.Service;

import com.example.travelvn.Reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class UserServiceImp extends UserService {

    @Autowired
    private UserReponsitory userReponsitory;
}

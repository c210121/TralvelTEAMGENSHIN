package com.example.travelvn.Controller;

import com.example.travelvn.Model.Request.User;
import com.example.travelvn.Service.UserService;
import com.example.travelvn.Service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UserController {
    private static String UPLOAD_DIR = "./VScode/img/";

    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping("/list")
    public User getalluser() {
        User userList = userService.getalluser();
        return userList;
    }

}

package com.springboot.first.controller;

import com.springboot.first.domain.User;
import com.springboot.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by jianyuan.wei@hand-china.com
 * on 2019/5/11 17:05.
 */
@RestController
@RequestMapping(value = "v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/query")
    public ResponseEntity<List<User>> queryUser() {
        return ResponseEntity.ok(userService.queryUser());
    }
}

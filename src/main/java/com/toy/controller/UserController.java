package com.toy.controller;

import com.toy.controller.common.CommonController;
import com.toy.model.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/user")
public class UserController extends CommonController {

    @GetMapping("")
    public ResponseEntity<User> user() {
        User a = new User("name","email");

        return ok(a);
    }

    @PostMapping("")
    public String registUser() {
        return "OK";
    }
}

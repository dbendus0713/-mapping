package com.toy.controller;

import com.toy.controller.common.CommonController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController extends CommonController {

    @GetMapping("")
    public String login() {
        return "OK";
    }
}

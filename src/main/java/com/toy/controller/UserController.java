package com.toy.controller;

import com.toy.controller.common.CommonController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends CommonController {

    @GetMapping("/user")
    public String user() {
        return "OK";
    }
}

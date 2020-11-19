package org.wz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wz.entity.User;
import org.wz.service.UserService;

import javax.annotation.Resource;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUser/{id}")
    public String getUser(@PathVariable String id){
        User user = userService.getUser(id);
        System.out.println(user);
        return "index";
    }
}

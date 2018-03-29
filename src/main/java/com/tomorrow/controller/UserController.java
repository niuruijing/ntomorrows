package com.tomorrow.controller;

import com.tomorrow.model.User;
import com.tomorrow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by niuruijing on 2018/3/28.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index(){
        return "/index";
    }

    @ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(User user){
        return userService.add(user);
    }

}

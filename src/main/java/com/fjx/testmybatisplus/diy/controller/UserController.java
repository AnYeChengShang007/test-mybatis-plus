package com.fjx.testmybatisplus.diy.controller;
import com.fjx.testmybatisplus.diy.pojo.User;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 冯金星
 * @since 2020-03-29
 */
@RestController
@RequestMapping("/diy/user")
public class UserController {

    @ResponseBody
    @RequestMapping("/")
    public User getUser(){
        return new User();
    }

}


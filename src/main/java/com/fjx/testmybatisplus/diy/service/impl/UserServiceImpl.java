package com.fjx.testmybatisplus.diy.service.impl;

import com.fjx.testmybatisplus.diy.pojo.User;
import com.fjx.testmybatisplus.diy.mapper.UserMapper;
import com.fjx.testmybatisplus.diy.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 冯金星
 * @since 2020-03-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

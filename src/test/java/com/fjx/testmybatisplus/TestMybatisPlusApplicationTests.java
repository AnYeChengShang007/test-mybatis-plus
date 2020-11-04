package com.fjx.testmybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fjx.testmybatisplus.mapper.UserMapper;
import com.fjx.testmybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestMybatisPlusApplicationTests {

    @Autowired
    private UserMapper mapper;

    @Test
    void contextLoads() {
        mapper.deleteById(1);
    }
}

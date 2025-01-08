package com.example.hellospringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hellospringboot.entity.User;

public interface UserMapper extends BaseMapper<User> {
    // 可以直接使用 BaseMapper 提供的 CRUD 方法
}
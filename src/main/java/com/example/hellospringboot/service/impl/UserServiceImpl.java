package com.example.hellospringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hellospringboot.entity.User;
import com.example.hellospringboot.mapper.UserMapper;
import com.example.hellospringboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
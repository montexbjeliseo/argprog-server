package com.mtx.argservr.security.service.impl;

import com.mtx.argservr.security.dto.request.UpdateUserDto;
import com.mtx.argservr.security.dto.response.UserDto;
import com.mtx.argservr.security.mapper.UserMapper;
import com.mtx.argservr.security.model.User;
import com.mtx.argservr.security.repository.UserRepository;
import com.mtx.argservr.security.service.IUserService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto update(UpdateUserDto dto) {
        User user = userRepository.findAll().get(0); //Si no hay usuarios me muero
        user = userMapper.update(dto, user);
        return userMapper.toDto(user);
    }

}

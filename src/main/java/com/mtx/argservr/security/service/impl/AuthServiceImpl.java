package com.mtx.argservr.security.service.impl;

import com.mtx.argservr.security.dto.request.LoginUserDto;
import com.mtx.argservr.security.dto.request.RegisterUserDto;
import com.mtx.argservr.security.dto.response.RegisteredUserDto;
import com.mtx.argservr.security.dto.response.TokenInfo;
import com.mtx.argservr.security.mapper.UserMapper;
import com.mtx.argservr.security.model.Role;
import com.mtx.argservr.security.model.User;
import com.mtx.argservr.security.repository.RoleRepository;
import com.mtx.argservr.security.repository.UserRepository;
import com.mtx.argservr.security.service.IAuthService;
import com.mtx.argservr.security.service.IJwtService;
import com.mtx.argservr.util.Constants.Roles;
import java.util.HashSet;
import java.util.Set;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AuthServiceImpl implements IAuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bcrypt;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IJwtService jwtService;

    @Override
    public RegisteredUserDto register(RegisterUserDto dto) {
        if (dto != null) {
            throw new RuntimeException("No se adminten más registros");
        }
        //Todo lo demás será ignorado
        if (userRepository.existsByUsername(dto.getUsername())) {
            throw new RuntimeException("Ya se encuentra registrado: " + dto.getUsername());
        }
        User user = userMapper.toUser(dto);
        user.setPassword(bcrypt.encode(dto.getPassword()));
        user.setRoles(getDefaultRoles());
        User saved = userRepository.save(user);
        RegisteredUserDto response = userMapper.toRegisteredDto(saved);
        response.setJwtToken(jwtService.generateToken(saved));
        return response;
    }

    @Override
    public TokenInfo login(LoginUserDto dto) {
        if (!userRepository.existsByUsername(dto.getUsername())) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        try {
            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword())
            );
            return new TokenInfo(jwtService.generateToken((UserDetails) auth.getPrincipal()));
        } catch (BadCredentialsException ex) {
            throw ex;
        }
    }

    private Set<Role> getDefaultRoles() {
        Set<Role> roles = new HashSet<>();
        roles.add(roleRepository.findByName(Roles.USER).get());
        return roles;
    }
}

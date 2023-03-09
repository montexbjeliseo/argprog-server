package com.mtx.argservr.util;

import com.mtx.argservr.security.model.Role;
import com.mtx.argservr.security.model.User;
import com.mtx.argservr.security.repository.RoleRepository;
import com.mtx.argservr.security.repository.UserRepository;
import com.mtx.argservr.util.Constants.Roles;
import com.mtx.argservr.util.Constants.UserData;
import java.util.HashSet;
import java.util.Set;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class DataLoader implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bcrypt;
    
    @Override
    public void run(String... args) throws Exception {
        if (!roleRepository.existsByName(Roles.USER)) {
            Role user = new Role();
            user.setName(Roles.USER);
            user.setDescription(Roles.USER_DESCRIPTION);
            roleRepository.save(user);
        }

        if (!userRepository.existsByEmail(UserData.EMAIL)) {
            User user = new User();
            user.setFirstName(UserData.FIRSTNAME);
            user.setLastName(UserData.LASTNAME);
            user.setEmail(UserData.EMAIL);
            user.setPassword(bcrypt.encode(UserData.PASSWORD));
            Set<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName(Roles.USER).get());
            user.setRoles(roles);
            userRepository.save(user);
        }
    }

}

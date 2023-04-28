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
import org.springframework.core.env.Environment;
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

    @Autowired
    private Environment env;

    @Override
    public void run(String... args) throws Exception {
        if (!roleRepository.existsByName(Roles.USER)) {
            Role user = new Role();
            user.setName(Roles.USER);
            user.setDescription(Roles.USER_DESCRIPTION);
            roleRepository.save(user);
        }

        if (!userRepository.existsByUsername(env.getProperty("custom.user"))) {
            User user = new User();
            user.setUsername(env.getProperty("custom.user"));
            user.setFirstName(UserData.FIRSTNAME);
            user.setLastName(UserData.LASTNAME);
            user.setEmail(env.getProperty("custom.user"));
            user.setPassword(bcrypt.encode(env.getProperty("custom.pass")));
            Set<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName(Roles.USER).get());
            user.setRoles(roles);
            userRepository.save(user);
        }
    }
}

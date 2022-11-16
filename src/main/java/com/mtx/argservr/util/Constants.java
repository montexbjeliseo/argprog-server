package com.mtx.argservr.util;

public class Constants {

    public static abstract class Tables {

        public static final String USERS = "users";
        public static final String ROLES = "roles";
        public static final String USERS_ROLES = USERS + "_" + ROLES;
        public static final String ROLE_ID = "role_id";
        public static final String USER_ID = "user_id";
    }

    public static abstract class Endpoints {

        public static final String ROOT = "/api";
        public static final String AUTH = ROOT + "/auth";
        public static final String REGISTER = "/register";
        public static final String LOGIN = "/login";

        public static final String REGISTER_PATH = AUTH + REGISTER;
        public static final String LOGIN_PATH = AUTH + LOGIN;
    }

    public static abstract class Patterns {

        public static final String FIRSTNAME_PATTERN = "^[a-zA-Z][ a-zA-Z]*$";
        public static final String LASTNAME_PATTERN = "^[a-zA-Z][ a-zA-Z]*$";
        public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–{}:;',?/*~$^+=<>]).{8,20}$";

    }

    public static abstract class Roles {

        public static final String USER = "USER";
        public static final String USER_DESCRIPTION = "Tiene accesso a todas las rutas de usuario y a modificar su informacion.";
    }

    public static abstract class Filter {

        public static final String AUTHORIZATION = "Authorization";
        public static final String BEARER = "Bearer ";
        public static final long JWT_TOKEN_VALIDITY = 1000 * 60 * 60 * (long) 8; // 8 Horas
    }

    public static abstract class UserData {

        public static final String FIRSTNAME = "Eliseo";
        public static final String LASTNAME = "Montenegro";
        public static final String EMAIL = "secondmtx@gmail.com";
        public static final String PASSWORD = "$2a$10$d/hwuYFd2ZzTVdLjADUM3.RTXsIP9eMXKfTJ0jgciW.YI.SzVFPSy";
    }
}

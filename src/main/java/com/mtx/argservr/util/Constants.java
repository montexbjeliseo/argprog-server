package com.mtx.argservr.util;

public class Constants {

    public static abstract class Tables {

        public static final String USERS = "users";
        public static final String ROLES = "roles";
        public static final String USERS_ROLES = USERS + "_" + ROLES;
        public static final String ROLE_ID = "role_id";
        public static final String USER_ID = "user_id";
        public static final String EDUCATIONS = "educations";
        public static final String EXPERIENCES = "experiences";
        public static final String PROJECTS = "projects";
        public static final String SKILLS = "skills";
        public static final String SOCIAL_MEDIA = "socialmedias";
        public static final String LANGUAGES = "languages";

    }

    public static abstract class Endpoints {

        public static final String ROOT = "/api";
        public static final String AUTH = ROOT + "/auth";
        public static final String REGISTER = "/register";
        public static final String LOGIN = "/login";

        public static final String REGISTER_PATH = AUTH + REGISTER;
        public static final String LOGIN_PATH = AUTH + LOGIN;

        public static final String EDUCATION = ROOT + "/educations";
        public static final String EXPERIENCE = ROOT + "/experiences";
        public static final String PROJECT = ROOT + "/projects";
        public static final String SKILL = ROOT + "/skills";
        public static final String PUBLIC_RESOURCE = ROOT + "/public/resources";
        public static final String SOCIAL_MEDIA = ROOT + "/social/medias";
        public static final String LANGUAGE = ROOT + "/languages";
        public static final String ABOUT = ROOT + "/about";
        public static final String ID = "/{id}";
    }

    public static abstract class Patterns {

        public static final String FIRSTNAME_PATTERN = "^([a-zA-ZñÑáéíóúüÁÉÍÓÚÜ]{2,50})(([ a-zA-ZñÑáéíóúüÁÉÍÓÚÜ]{2,50})){0,1}$";
        public static final String LASTNAME_PATTERN = "^([a-zA-ZñÑáéíóúüÁÉÍÓÚÜ]{2,50})(([ a-zA-ZñÑáéíóúüÁÉÍÓÚÜ]{2,50})){0,1}$";
        public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–{}:;',?/*~$^+=<>]).{8,20}$";

        public static final String TITLE_PATTERN = "^[\\\\w\\\\s\\\\p{Punct} aA-zZáéíóúüÁÉÍÓÚÜñÑ0-9\\-\\+\\?\\*]+$";
        public static final String DESCRIPTION_PATTERN = "^[\\\\w\\\\s\\\\p{Punct} aA-zZáéíóúüÁÉÍÓÚÜñÑ0-9\\-\\+\\?\\*]+$";

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
    }
}

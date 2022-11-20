package com.mtx.argservr.service.impl;

import com.mtx.argservr.dto.response.PublicResource;
import com.mtx.argservr.mapper.PublicResourceMapper;
import com.mtx.argservr.security.model.User;
import com.mtx.argservr.security.repository.UserRepository;
import com.mtx.argservr.service.IEducationService;
import com.mtx.argservr.service.IExperienceService;
import com.mtx.argservr.service.ILanguageService;
import com.mtx.argservr.service.IProjectService;
import com.mtx.argservr.service.IPublicResourceService;
import com.mtx.argservr.service.ISkillService;
import com.mtx.argservr.service.ISocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicResourceServiceImpl implements IPublicResourceService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private IEducationService educationService;
    
    @Autowired
    private IExperienceService experienceService;
    
    @Autowired
    private ISkillService skillService;
    
    @Autowired
    private IProjectService projectService;
    
    @Autowired
    private ISocialMediaService socialMediaService;
    
    @Autowired
    private ILanguageService languageService;
    
    @Autowired
    private PublicResourceMapper PRMapper;
    
    @Override
    public PublicResource get() {
        User user = userRepository.findAll().get(0); //Si no hay usuarios me muero
        PublicResource response = PRMapper.toPR(user);
        response.setEducations(educationService.getAll());
        response.setExperiences(experienceService.getAll());
        response.setProjects(projectService.getAll());
        response.setSkills(skillService.getAll());
        response.setSocialMedias(socialMediaService.getAll());
        response.setLanguages(languageService.getAll());
        return response;
    }
}

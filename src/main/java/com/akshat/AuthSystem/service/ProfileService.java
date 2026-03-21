package com.akshat.AuthSystem.service;

import com.akshat.AuthSystem.io.ProfileRequest;
import com.akshat.AuthSystem.io.ProfileResponse;
import org.springframework.context.annotation.Profile;

public interface ProfileService {
    ProfileResponse createProfile(ProfileRequest reauest);
}

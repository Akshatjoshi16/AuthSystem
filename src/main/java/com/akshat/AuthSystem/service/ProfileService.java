package com.akshat.AuthSystem.service;

import com.akshat.AuthSystem.io.ProfileRequest;
import com.akshat.AuthSystem.io.ProfileResponse;
import org.springframework.context.annotation.Profile;

public interface ProfileService {
    ProfileResponse createProfile(ProfileRequest reauest);

    ProfileResponse getProfile(String email);

    void sendResetOtp(String email);

    void resetPassword(String email,String otp,String newPassword);

    void sendOtp(String email);
    void verifyOtp(String email,String otp);



}

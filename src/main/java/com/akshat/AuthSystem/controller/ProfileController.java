package com.akshat.AuthSystem.controller;

import com.akshat.AuthSystem.io.ProfileRequest;
import com.akshat.AuthSystem.io.ProfileResponse;
import com.akshat.AuthSystem.service.ProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileResponse register(@Valid @RequestBody ProfileRequest request){
        ProfileResponse response=profileService.createProfile(request);
        return response;
    }
}

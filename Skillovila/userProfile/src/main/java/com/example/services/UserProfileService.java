package com.example.services;// UserProfileService.java (Service)
import com.example.entity.UserProfile;
import com.example.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserProfileService {

    private final UserProfileRepository repository;

    @Autowired
    public UserProfileService(UserProfileRepository repository) {
        this.repository = repository;
    }

    public List<UserProfile> getAllUserProfiles() {
        return repository.findAll();
    }

    public Optional<UserProfile> getUserProfileById(Long id) {
        return repository.findById(id);
    }

    public UserProfile createUserProfile(UserProfile userProfile) {
        userProfile.setCreatedAt(LocalDateTime.now());
        return repository.save(userProfile);
    }

    public UserProfile updateUserProfile(Long id, UserProfile userProfileDetails) {
        UserProfile userProfile = repository.findById(id).orElse(null);
        if (userProfile != null) {
            userProfile.setUsername(userProfileDetails.getUsername());
            userProfile.setEmail(userProfileDetails.getEmail());
            return repository.save(userProfile);
        }
        return null;
    }

    public boolean deleteUserProfile(Long id) {
        Optional<UserProfile> userProfile = repository.findById(id);
        if (userProfile.isPresent()) {
            repository.delete(userProfile.get());
            return true;
        }
        return false;
    }
}

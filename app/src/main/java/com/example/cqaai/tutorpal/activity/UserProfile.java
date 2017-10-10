package com.example.cqaai.tutorpal.activity;

/**
 * Created by ainulfi3 on 10/9/17.
 */

public class UserProfile {

    private String header;

    private String profileContent;

    public UserProfile(String header, String profileContent) {
        this.header = header;
        this.profileContent = profileContent;
    }

    public String getHeader() {
        return header;
    }

    public String getProfileContent() {
        return profileContent;
    }
}

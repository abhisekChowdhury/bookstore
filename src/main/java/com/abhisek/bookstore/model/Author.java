package com.abhisek.bookstore.model;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private int profileId;
    private String profilePicUrl;
    private String name;
    private String description;

    public Author(){

    }

    public Author(int profileId, String profilePicUrl, String name, String description) {
        this.profileId = profileId;
        this.profilePicUrl = profilePicUrl;
        this.name = name;
        this.description = description;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

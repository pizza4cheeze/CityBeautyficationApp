package vsu.csf.grushevskaya.CityBeautyficationApp.TO.user;

import jakarta.validation.constraints.Email;

public class UserWithNoIdTO {
    private String username;
    private String moderCode;
    private String profilePhoto;
    @Email
    private String email;
    private String phoneNumber;

    public UserWithNoIdTO(String username, String moderCode, String profilePhoto, String email, String phoneNumber) {
        this.username = username;
        this.moderCode = moderCode;
        this.profilePhoto = profilePhoto;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public UserWithNoIdTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getModerCode() {
        return moderCode;
    }

    public void setModerCode(String moderCode) {
        this.moderCode = moderCode;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package vsu.csf.grushevskaya.CityBeautyficationApp.TO.user;

import vsu.csf.grushevskaya.CityBeautyficationApp.models.User;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.UserRole;

public class UserTO {
    private Integer id;
    private String username;
    private String moderCode;
    private UserRole userRole;
    private String profilePhoto;
    private String email;
    private String phoneNumber;

    public UserTO(Integer id, String username, String moderCode, UserRole userRole, String profilePhoto, String email, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.moderCode = moderCode;
        this.userRole = userRole;
        this.profilePhoto = profilePhoto;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public UserTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.moderCode = user.getModerCode();
        this.userRole = user.getUserRole();
        this.profilePhoto = user.getProfilePhoto();
        this.email = user.getEmail();
        this.phoneNumber = user.getPhoneNumber();
    }

    public UserTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
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

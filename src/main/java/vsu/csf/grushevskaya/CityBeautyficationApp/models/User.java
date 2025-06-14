package vsu.csf.grushevskaya.CityBeautyficationApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.user.UserWithNoIdTO;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String moderCode;
    private UserRole userRole;
    private String profilePhoto;
    private String email;
    private String phoneNumber;

    public User(Integer id, String username, String moderCode, UserRole userRole, String profilePhoto, String email, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.moderCode = moderCode;
        this.userRole = userRole;
        this.profilePhoto = profilePhoto;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    // конструктор из объекта без id в объект с id = null
    public User(UserWithNoIdTO userWithNoIdTO, boolean isAdmin) {
        this.id = null;
        this.username = userWithNoIdTO.getUsername();
        this.moderCode = userWithNoIdTO.getModerCode();
        this.userRole = isAdmin ? UserRole.ROLE_MODERATOR : UserRole.ROLE_USER;
        this.profilePhoto = userWithNoIdTO.getProfilePhoto();
        this.email = userWithNoIdTO.getEmail();
        this.phoneNumber = userWithNoIdTO.getPhoneNumber();
    }

    public Integer getId() {
        return id;
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

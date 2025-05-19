package vsu.csf.grushevskaya.CityBeautyficationApp.controllers;

import org.springframework.web.bind.annotation.*;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.user.UserTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.user.UserWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.User;
import vsu.csf.grushevskaya.CityBeautyficationApp.services.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/register")
    public User registerNewUser(@RequestBody UserWithNoIdTO userWithNoIdTO) {
        return userService.createNewUser(userWithNoIdTO);
    }

    @PostMapping(path = "/register-admin")
    public User registerNewAdmin(@RequestBody UserWithNoIdTO userWithNoIdTO) {
        return userService.createNewAdmin(userWithNoIdTO);
    }

    @PutMapping(path = "/update")
    public User updateUserInfo(@RequestBody User user) {
        return userService.updateUserInfo(user);
    }

    @PutMapping(path = "/ban")
    public User banUser(@RequestBody User user) {
        return userService.banUser(user);
    }

    @PutMapping(path = "/unban")
    public User unbanUser(@RequestBody User user) {
        return userService.unbanUser(user);
    }

    @GetMapping(path = "/{id}")
    public UserTO findUserById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @GetMapping(path = "/find-by-username")
    public List<User> findUsersByUsername(@RequestBody String username) {
        return userService.findByUserName(username);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userService.deleteById(id);
    }
}

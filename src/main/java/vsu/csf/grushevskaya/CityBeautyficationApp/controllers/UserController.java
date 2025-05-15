package vsu.csf.grushevskaya.CityBeautyficationApp.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.user.UserTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.user.UserWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.User;
import vsu.csf.grushevskaya.CityBeautyficationApp.services.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    private UserService userService;

    @RequestMapping(path = "/register")
    public User registerNewUser(@RequestBody UserWithNoIdTO userWithNoIdTO) {
        return userService.createNewUser(userWithNoIdTO);
    }

    @RequestMapping(path = "/update")
    public User updateUserInfo(@RequestBody User user) {
        return userService.updateUserInfo(user);
    }

    @RequestMapping(path = "/ban")
    public User banUser(@RequestBody User user) {
        return userService.banUser(user);
    }

    @RequestMapping(path = "/unban")
    public User unbanUser(@RequestBody User user) {
        return userService.unbanUser(user);
    }

    @RequestMapping(path = "/{id}")
    public UserTO findUserById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @RequestMapping(path = "/find/{username}")
    public List<User> findUsersByUsername(@PathVariable String username) {
        return userService.findByUserName(username);
    }

    @RequestMapping(path = "/delete/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userService.deleteById(id);
    }
}

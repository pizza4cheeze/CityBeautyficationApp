package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.user.UserTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.user.UserWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.User;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.UserRole;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createNewUser(UserWithNoIdTO userWithNoIdTO) {
        return userRepository.save(new User(userWithNoIdTO, false));
    }

    public User createNewAdmin(UserWithNoIdTO userWithNoIdTO) {
        return userRepository.save(new User(userWithNoIdTO, true));
    }

    public User updateUserInfo(User user) {
        return userRepository.save(user);
    }

    public User banUser(User user) {
        user.setUserRole(UserRole.ROLE_BANNED);
        return userRepository.save(user);
    }

    public User unbanUser(User user) {
        user.setUserRole(UserRole.ROLE_USER);
        return userRepository.save(user);
    }

    public UserTO findById(Integer id) {
        User user = userRepository.getById(id);
        return new UserTO(user);
    }

    public List<User> findByUserName(String username) {
        return userRepository.getAllByUsernameContainsIgnoreCase(username);
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}

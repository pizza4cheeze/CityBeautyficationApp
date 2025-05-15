package vsu.csf.grushevskaya.CityBeautyficationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    User save(User user);
    User getById(Integer id);
    List<User> getAllByUsername(String username);
    void deleteById(Integer id);
}

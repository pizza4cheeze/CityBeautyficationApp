package vsu.csf.grushevskaya.CityBeautyficationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Status;

import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
    List<Status> findAll();
    Status getById(Integer id);
    Status getByName(String name);
}

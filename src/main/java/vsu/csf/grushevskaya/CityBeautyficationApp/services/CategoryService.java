package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CategoryService {
    public Integer categorizePhoto(String pathToPhoto) {
        Random rnd = new Random();
        return rnd.nextInt(10) + 1;
    }
}

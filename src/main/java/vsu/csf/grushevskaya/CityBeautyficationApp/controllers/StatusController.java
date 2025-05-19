package vsu.csf.grushevskaya.CityBeautyficationApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.StatusTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.services.StatusService;

import java.util.List;

@RestController
@RequestMapping(path = "/status")
public class StatusController {
    StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping(path = "/get-all")
    public List<StatusTO> getAllStatuses() {
        return statusService.getAllStatuses();
    }
}

package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.StatusTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Status;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.StatusRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusService {
    private StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    public List<StatusTO> getAllStatuses() {
        return statusToStatusTO(statusRepository.findAll());
    }

    public Status getStatusById(Integer id) {
        return statusRepository.getById(id);
    }

    private List<StatusTO> statusToStatusTO(List<Status> statusList) {
        List<StatusTO> result = new ArrayList<>();
        for (Status s : statusList) {
            result.add(new StatusTO(s));
        }
        return result;
    }
}

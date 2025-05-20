package vsu.csf.grushevskaya.CityBeautyficationApp;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.csf.grushevskaya.CityBeautyficationApp.services.UpvoteService;

@RestController
@RequestMapping(path = "/shedule")
public class SheduledTasks {
    private final UpvoteService upvoteService;

    public SheduledTasks(UpvoteService upvoteService) {
        this.upvoteService = upvoteService;
    }

    @DeleteMapping(path = "/test")
//    @Scheduled(fixedRate = 60 * 60 * 1000)
    public void cleanUpOldUpvotes() {
        upvoteService.deleteUpvotesOlderThanAWeek();
    }
}

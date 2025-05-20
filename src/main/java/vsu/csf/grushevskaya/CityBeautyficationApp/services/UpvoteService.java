package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.upvote.UpvoteTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.upvote.UpvoteWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Upvote;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.UpvoteRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UpvoteService {
    private UpvoteRepository upvoteRepository;

    public UpvoteService(UpvoteRepository upvoteRepository) {
        this.upvoteRepository = upvoteRepository;
    }

    public Upvote createUpvote(UpvoteWithNoIdTO upvoteWithNoIdTO) {
        return upvoteRepository.save(new Upvote(upvoteWithNoIdTO));
    }

    public Upvote updateUpvote(UpvoteTO upvoteTO) {
        return upvoteRepository.save(new Upvote(upvoteTO));
    }

    public List<Upvote> getAllUpdatesByProblemId(Integer problemId) {
        return upvoteRepository.getAllByProblemId(problemId);
    }

    public void deleteUpvoteById(Integer id) {
        upvoteRepository.deleteById(id);
    }

    public void deleteUpvotesOlderThanAWeek() {
        LocalDateTime weekAgo = LocalDateTime.now().minusWeeks(1);
        upvoteRepository.deleteUpvotesOlderThanAWeek(weekAgo);
    }
}

package com.voting.votingapp.services;

import com.voting.votingapp.models.OptionVote;
import com.voting.votingapp.models.Poll;
import com.voting.votingapp.repositories.PollRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll pollCreate(Poll poll) {
        return pollRepository.save(poll);
    }


    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }


    public Optional<Poll> getPollById(Long id) {
        return pollRepository.findById(id);
    }

    public void vote(Long pollId, int optionIndex) {
        // Get Poll from DB
        Poll poll = pollRepository.findById(pollId)
                .orElseThrow(() -> new RuntimeException("Poll not found"));

        //Get all options
        List<OptionVote> options = poll.getOptions();

        //If index for oe is not valid, throw error
        if(optionIndex < 0 || optionIndex >= options.size()){
            throw new IllegalArgumentException("Invalid option index");
        }

        //Get Selected Option
        OptionVote selectedOption = options.get(optionIndex);

        //Increment vote for selected option
        selectedOption.setVoteOption(selectedOption.getVoteOption() + 1);

        //Save incremented option into the database
        pollRepository.save(poll);
    }
}

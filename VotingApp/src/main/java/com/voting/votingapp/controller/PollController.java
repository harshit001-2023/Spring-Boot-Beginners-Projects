package com.voting.votingapp.controller;

import com.voting.votingapp.models.Poll;
import com.voting.votingapp.services.PollService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import request.Vote;

import java.util.List;

@RestController
@RequestMapping("api/polls")
public class PollController {
    private final PollService pollService;

    public PollController(PollService pollService){
        this.pollService = pollService;
    }

    @PostMapping
    public Poll pollCreate(@RequestBody Poll poll){
        return pollService.pollCreate(poll);
    }

    @GetMapping
    public List<Poll> getAllPolls(){
        return pollService.getAllPolls();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Poll> getPoll(@PathVariable Long id){
        return pollService.getPollById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //POST
    //VOTE
    // SERVICE
    @PostMapping("/vote")
    public void vote(@RequestBody Vote vote){
        pollService.vote(vote.getPollId(), vote.getOptionIndex());
    }
}

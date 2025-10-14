package com.voting.votingapp.models;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class OptionVote {
    private String option;
    private Long voteOption = 0L;
}

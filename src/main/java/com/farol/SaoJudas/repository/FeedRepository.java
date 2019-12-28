package com.farol.SaoJudas.repository;

import com.farol.SaoJudas.domain.Feed;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public abstract class FeedRepository implements Repository {
    public abstract Optional<Feed> FindFeedByName(String Name);
}

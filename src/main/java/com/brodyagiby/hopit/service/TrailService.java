package com.brodyagiby.hopit.service;

import com.brodyagiby.hopit.domain.Trail;
import com.brodyagiby.hopit.repository.TrailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrailService {

    private final TrailRepository trailRepository;

    public TrailService(TrailRepository trailRepository) {
        this.trailRepository = trailRepository;
    }

    public List<Trail> getAll() {
        return trailRepository.findAll();
    }
}

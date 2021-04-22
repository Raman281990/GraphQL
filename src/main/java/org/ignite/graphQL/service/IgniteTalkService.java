package org.ignite.graphQL.service;

import org.ignite.graphQL.domain.TechTalk;
import org.ignite.graphQL.repository.IgniteTalkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IgniteTalkService {

    @Autowired
    private IgniteTalkRepository talkRepository;

    public List<TechTalk> findAll() {
        return talkRepository.findAll();
    }

}

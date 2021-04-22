package org.ignite.graphQL.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.ignite.graphQL.domain.TechTalk;
import org.ignite.graphQL.domain.Speaker;
import org.ignite.graphQL.domain.SpeakerTalk;
import org.ignite.graphQL.repository.SpeakerRepository;
import org.ignite.graphQL.repository.SpeakerTalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository;

    @Autowired
    private SpeakerTalkRepository speakerTalkRepository;

    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    public List<Speaker> findAllSpeakersForTalk(TechTalk talk) {
        List<SpeakerTalk> speakerTalk = speakerTalkRepository.findAllByIgniteTalkId(talk.getId());
        return speakerTalk.stream()
                .map(e -> speakerRepository.findById(e.getSpeakerId()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    public Speaker save(Speaker speaker) {
        return speakerRepository.save(speaker);
    }
}

package org.ignite.graphQL.repository;

import java.util.List;
import org.ignite.graphQL.domain.SpeakerTalk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerTalkRepository extends JpaRepository<SpeakerTalk,Long> {
    List<SpeakerTalk> findAllBySpeakerId(Long speakerId);
    List<SpeakerTalk> findAllByIgniteTalkId(Long talkId);

}

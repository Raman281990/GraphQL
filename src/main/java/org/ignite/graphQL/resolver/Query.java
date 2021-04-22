package org.ignite.graphQL.resolver;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.ignite.graphQL.domain.Attendee;
import org.ignite.graphQL.domain.TechTalk;
import org.ignite.graphQL.domain.Speaker;
import org.ignite.graphQL.service.AttendeeService;
import org.ignite.graphQL.service.IgniteTalkService;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.ignite.graphQL.service.SpeakerService;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Query implements GraphQLQueryResolver {

    private final IgniteTalkService talkService;

    private final AttendeeService attendeeService;

    private final SpeakerService speakerService;

    public List<TechTalk> allTalks(){
      return talkService.findAll();
    }

    public List<Attendee> allAttendees() { return attendeeService.findAll(); }

    public List<Speaker> allSpeakers() { return speakerService.findAll(); }

}

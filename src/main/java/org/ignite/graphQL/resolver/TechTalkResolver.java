package org.ignite.graphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import java.util.List;
import javax.xml.bind.ValidationException;
import org.ignite.graphQL.domain.Speaker;
import org.ignite.graphQL.domain.TechTalk;
import org.ignite.graphQL.exception.CustomGraphQLException;
import org.ignite.graphQL.service.SpeakerService;
import org.springframework.stereotype.Component;

@Component
public class TechTalkResolver implements GraphQLResolver<TechTalk> {

    private SpeakerService speakerService;

    public TechTalkResolver(final SpeakerService speakerService) {
        this.speakerService = speakerService;
    }

    public List<Speaker> speaker(TechTalk techTalk) throws ValidationException {
        throw new CustomGraphQLException(1, "Data problem");
        //return speakerService.findAllSpeakersForTalk(techTalk);
    }
}

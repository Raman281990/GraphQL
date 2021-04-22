package org.ignite.graphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.ignite.graphQL.domain.Speaker;
import org.ignite.graphQL.domain.SpeakerInput;
import org.ignite.graphQL.service.SpeakerService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@RequiredArgsConstructor
@Component
@Validated
public class Mutation implements GraphQLMutationResolver {

    private final SpeakerService speakerService;

    public Speaker addSpeaker(@Valid SpeakerInput speakerInput) {
        Speaker speaker = Speaker.builder()
                .name(speakerInput.getName())
                .twitter(speakerInput.getTwitter())
                .build();
        return speakerService.save(speaker);
    }

}

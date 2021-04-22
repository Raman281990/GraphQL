package org.ignite.graphQL.domain;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SpeakerInput {

    @NotBlank
    private String name;
    private String twitter;
}

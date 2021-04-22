package org.ignite.graphQL.config;

import java.net.URL;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class JwsProperties {
    private URL jwkUrl;
    private int connectionTimeout;
    private int readTimeout;
    private boolean disableVerification;

}

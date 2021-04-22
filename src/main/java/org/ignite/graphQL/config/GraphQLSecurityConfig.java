package org.ignite.graphQL.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
/*@EnableWebSecurity // Debug = true, will print the execution of the FilterChainProxy
@EnableGlobalMethodSecurity(
       securedEnabled = true,
       prePostEnabled = true)
@RequiredArgsConstructor*/
public class GraphQLSecurityConfig { /*extends WebSecurityConfigurerAdapter {

    private final PreAuthenticatedAuthenticationProvider preAuthenticatedAuthenticationProvider;

    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) {
        authenticationManagerBuilder.authenticationProvider(preAuthenticatedAuthenticationProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.info("Configuring spring security");

        http
                // Add the Pre Authentication Filter
                .addFilterBefore(createRequestHeadersPreAuthenticationFilter(),
                        AbstractPreAuthenticatedProcessingFilter.class)
                .authorizeRequests()
                // All endpoints require authentication
                .anyRequest().authenticated()
                .and()
                // Disable CSRF Token generation
                .csrf().disable()
                // Disable the default HTTP Basic-Auth
                .httpBasic().disable()
                // Disable the session management filter
                .sessionManagement().disable()
                // Disable the /logout filter
                .logout().disable()
                // Disable anonymous users
                .anonymous().disable();
    }

    @Override
    public void configure(WebSecurity web) {
        // Permit actuator health endpoint for uptime checks etc
        web.ignoring().antMatchers("/actuator/health");
    }

    private Filter createRequestHeadersPreAuthenticationFilter() throws Exception {
        RequestHeadersPreAuthenticationFilter filter = new RequestHeadersPreAuthenticationFilter();
        filter.setAuthenticationDetailsSource(new GrantedAuthoritiesAuthenticationDetailsSource());
        filter.setAuthenticationManager(authenticationManager());
        filter.setContinueFilterChainOnUnsuccessfulAuthentication(false);
        return filter;
    }*/
}

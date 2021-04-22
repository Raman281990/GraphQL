package org.ignite.graphQL.config;


public class GrantedAuthoritiesAuthenticationDetailsSource {/*implements
        AuthenticationDetailsSource<HttpServletRequest, PreAuthenticatedGrantedAuthoritiesWebAuthenticationDetails> {

    public static final String USER_ROLES_PRE_AUTH_HEADER = "user_roles";

    @Override
    public PreAuthenticatedGrantedAuthoritiesWebAuthenticationDetails buildDetails(
            HttpServletRequest request) {


        String userRoles = request.getHeader(USER_ROLES_PRE_AUTH_HEADER);
        List<GrantedAuthority> authorities = StringUtils.isBlank(userRoles) ? List.of() :
                getAuthorities(userRoles);
        return new PreAuthenticatedGrantedAuthoritiesWebAuthenticationDetails(request, authorities);
    }

    private List<GrantedAuthority> getAuthorities(String userRoles) {
        return Set.of(userRoles.split(","))
                .stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }*/

}
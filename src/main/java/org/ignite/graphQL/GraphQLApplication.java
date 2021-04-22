package org.ignite.graphQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQLApplication {

	/*@Autowired
	private IgniteTalkService talkService;

	@Autowired
	private AttendeeService attendeeService;

	@Autowired
	private SpeakerService speakerService;*/

	public static void main(String[] args) {
		SpringApplication.run(GraphQLApplication.class, args);
	}

	/*@Bean
	public ServletRegistrationBean graphQLServlet() {

		return new ServletRegistrationBean(SimpleGraphQLHttpServlet.newBuilder(buildSchema(talkService,attendeeService,speakerService)).build(),
				"/graphql");
	}


	private static GraphQLSchema buildSchema(IgniteTalkService talkService, AttendeeService attendeeService,
			SpeakerService speakerService) {
		return SchemaParser.newParser()
				.file("graphql/schema.graphqls")
				.resolvers(new Query(talkService,attendeeService,speakerService), new IgniteTalkResolver(speakerService),
						new Mutation(speakerService))
				.build()
				.makeExecutableSchema();
	}*/

}

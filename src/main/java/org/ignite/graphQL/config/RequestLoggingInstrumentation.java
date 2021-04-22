package org.ignite.graphQL.config;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.execution.instrumentation.InstrumentationContext;
import graphql.execution.instrumentation.SimpleInstrumentation;
import graphql.execution.instrumentation.SimpleInstrumentationContext;
import graphql.execution.instrumentation.parameters.InstrumentationExecutionParameters;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class RequestLoggingInstrumentation extends SimpleInstrumentation {

    @Override
    public InstrumentationContext<ExecutionResult> beginExecution(
            InstrumentationExecutionParameters parameters) {
        ExecutionInput executionInput = parameters.getExecutionInput();
        log.info("Query {} ",executionInput);
        return  SimpleInstrumentationContext.whenCompleted((executionResult, throwable) -> {
            if(throwable == null) {
                log.info("Excecution completed for query {}", executionInput.getQuery());
            }
        });
    }

}

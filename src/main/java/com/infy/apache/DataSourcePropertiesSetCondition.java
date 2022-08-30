package com.infy.apache;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DataSourcePropertiesSetCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().containsProperty("spring.datasource.driver-class-name") &&
                context.getEnvironment().containsProperty("spring.datasource.url");
    }

}

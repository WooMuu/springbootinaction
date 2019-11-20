package com.zjb.chapter2.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by zjb on 2019/11/18.
 * 这个条件对象表示：classpath下存在org.springframework.jdbc.core.JdbcTemplate才成立
 */
public class JdbcTemplateCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        try {
            conditionContext.getClassLoader().loadClass("org.springframework.jdbc.core.JdbcTemplate");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}

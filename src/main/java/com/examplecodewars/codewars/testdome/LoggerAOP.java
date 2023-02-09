package com.examplecodewars.codewars.testdome;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
import java.lang.annotation.*;
import java.util.*;
import org.springframework.stereotype.Service;


@Component
@Aspect
public class LoggerAOP {
    @Autowired
    private Logger logger;

    @Pointcut("execution(* *(..)) && @annotation(LogExecution)")
    public void loggingPointcut() {
        // Pointcut declaration
    }

    @Around("loggingPointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        long start = System.currentTimeMillis();
        Object result = null;
        System.out.println("itra");
        try {
            result = point.proceed();
            logger.log(      MethodSignature.class.cast(point.getSignature()).getMethod().getName());
        } finally {}

        return result;
    }
}

@Component
class NameRepository {
    @LogExecution
    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        return names;
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecution {}


interface Logger {
    public void log(String data);
}
@Configuration
@EnableAspectJAutoProxy
@Import({LoggerAOP.class, NameRepository.class})
class Configrf {
    @Bean
    public Logger logger() {
        return (message) -> System.out.println(message);
    }
}

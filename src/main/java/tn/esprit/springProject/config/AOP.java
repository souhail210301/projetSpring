package tn.esprit.springProject.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AOP {

    @Before("execution(* tn.esprit.springProject.services.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

    @After("execution(* tn.esprit.springProject.services.*.*(..))")
    public void logMethodOut(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("Execution Finie 4TWIN2 du service "+ name);
    }

    @AfterReturning("execution(public void tn.esprit.springProject.services.*.*(..))")
    public void logMethodOutOk(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("Très Bien " + name);
    }
    @Around("execution(* tn.esprit.springProject.services.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }
}

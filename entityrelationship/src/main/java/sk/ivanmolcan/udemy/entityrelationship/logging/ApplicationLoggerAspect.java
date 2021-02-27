package sk.ivanmolcan.udemy.entityrelationship.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class ApplicationLoggerAspect {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    //where to log
    //..* znamena class, methoda a dalsie
//    @Pointcut("within(sk.ivanmolcan.udemy.entityrelationship.controllers..*)"
//    + "|| within(sk.ivanmolcan.udemy.entityrelationship.dao..*)")
    @Pointcut("within(sk.ivanmolcan.udemy.entityrelationship.controllers..*)")
    public void definePackagePointcuts(){
        //empty method just to name the location specified in the pointcut
    }

    @Before("definePackagePointcuts()")
    public void logBefore(JoinPoint jp){
        log.debug(" \n \n \n ************* Before Method ************* \n {}.{} () with arguments[s] = {}, ",
                jp.getSignature().getDeclaringTypeName(),
                jp.getSignature().getName(), Arrays.toString(jp.getArgs()));
        log.debug("____________________________________ \n \n \n");

    }

}

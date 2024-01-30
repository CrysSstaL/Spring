package main.chapter_six.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Aspect
@Service
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(* main.chapter_six.services.*.*(..))") //Определение перехватываемых методов
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method will execute");
        joinPoint.proceed();  // Делегирование управления перехваченному методу
        logger.info("Method executed");
    }
}

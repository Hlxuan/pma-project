package com.hlxuan.pma.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApplicationLoggerAspect {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Pointcut("within(com.hlxuan.pma.controllers..*) || within(com.hlxuan.pma.dao..*)")
    public void definePackagePointcuts(){

    }

    @Before("definePackagePointcuts()")
    public void log1(){
        log.debug("--------------------------------------------------");
    }


    @After("definePackagePointcuts()")
    public void log(){
        log.debug("--------------------------------------------------");
    }

}

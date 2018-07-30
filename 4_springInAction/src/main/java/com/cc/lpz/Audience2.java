package com.cc.lpz;

@Aspect
public class Audience2 {

    @Pointcut("execution (** concert.Performance.perform(..))")
    public void performance(){}

    @Around("performance")
    public void watchPerformance(ProceedingJointPoint jp){
        try{
            System.out.println("Silence cell phones...");
            System.out.println("taking seats...");
            jp.proceed();
            System.out.println("clap clap ");
        }catch (Throwable e){
            System.out.println("demanding a refund");
        }
    }
}

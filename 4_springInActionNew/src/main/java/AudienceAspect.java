@Aspect
public class AudienceAspect {
    @Pointcut("execution (** concert.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void seliencePhones(){
        System.out.println("aaaaa");

    }
    @Before("performance()")
    public void takeSeats(){
        System.out.println("sssss");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("aaa");
    }

    @AfterReturning("performance()")
    public void demandRedund(){
        System.out.println("aaaaaa");
    }
}

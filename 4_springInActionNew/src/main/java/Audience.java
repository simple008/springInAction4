@Aspect
public class Audience {
    @Before("execution(** concert.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("silence cell phones");
    }

    @Before("execution(** concert.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("Taking seats...");
    }

    @AfterReturning("execution (** concert.Performance.perform(..))")
    public void applause(){
        System.out.println("CLAP CLAP ...");
    }

    @AfterReturning("execution (** concert.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding Refund");
    }
}

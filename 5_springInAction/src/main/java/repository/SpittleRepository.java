package repository;

public interface SpittleRepository {
    List<Spittle> findSpittle(long max, int count);
}

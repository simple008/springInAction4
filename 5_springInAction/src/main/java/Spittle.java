import java.util.Date;

public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private double latitude;
    private double longitude;

    public Spittle(String message, Date time){
        this(message, time, null, null);
    }

    public Spittle(String message, Date time, Double longitude,
                   Double latitude){
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Date getTime() {
        return time;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getId(){
        return  id;
    }

    public String getMessage(){
        return  message;
    }

    @Override
    public boolean equal(Object that){
        return EqualBuilder.reflectionEqual(this, that, "id", "time");
    }

    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }

}

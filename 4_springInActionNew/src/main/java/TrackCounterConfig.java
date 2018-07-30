import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy

public class TrackCounterConfig {

    /*@Bean
    public CompactDisc sgtPeppers() {
        BlankDisc cd = new BlackDisc();
        cd.setTitle("Sgt. pepper's...");
        cd.setArtist("artise...");
        List<String> tracks = new ArrayList<String>();
        tracks.add("Sgt. pepper's lonely");
        tracks.add("with a little...");
        tracks.add("lucy is ....");
        tracks.add("getting better");
        cd.setTrack(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }*/
}

package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc getRandomCompactDisc() {
        int choice = (int) (Math.random() * 4);
        switch (choice) {
            case 0:
                return new SgtPeppers();
            case 1:
                return new WhiteMusic();
            default:
                return new PersonnalMusic();
        }
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}

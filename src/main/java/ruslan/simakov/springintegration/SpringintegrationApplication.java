package ruslan.simakov.springintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
public class SpringintegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringintegrationApplication.class, args);
    }

}

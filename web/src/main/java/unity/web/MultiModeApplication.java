package unity.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"unity"})
@EnableJpaRepositories(basePackages = {"unity"})
public class MultiModeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiModeApplication.class);
    }

}

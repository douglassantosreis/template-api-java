import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"br.com.gpa.template.application", "br.com.gpa.template.domain", "br.com.gpa.template.infrastructure"})
@EnableMongoRepositories(basePackages = {"br.com.gpa.template.infrastructure.repositories"})
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }

}

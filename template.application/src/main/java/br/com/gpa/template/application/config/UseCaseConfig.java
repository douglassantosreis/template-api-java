package br.com.gpa.template.application.config;

import br.com.gpa.template.domain.interfaces.persistence.ListProductAdapter;
import br.com.gpa.template.domain.interfaces.services.ListProductPort;
import br.com.gpa.template.domain.usecase.ListProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class UseCaseConfig {

    private final ListProductAdapter adapter;

    @Bean
    public ListProductPort listProductPortConfig () {
        return new ListProductUseCase(adapter);
    }
}

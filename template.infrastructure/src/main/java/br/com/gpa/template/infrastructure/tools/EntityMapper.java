package br.com.gpa.template.infrastructure.tools;

import br.com.gpa.template.domain.models.Product;
import br.com.gpa.template.infrastructure.entities.ProductEntity;

import org.mapstruct.Mapper;

import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Mapper(componentModel = "spring")
public interface EntityMapper {

    List<Product> toProductList(List<ProductEntity> entities);

}

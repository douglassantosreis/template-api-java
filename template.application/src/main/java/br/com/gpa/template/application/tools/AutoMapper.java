package br.com.gpa.template.application.tools;

import br.com.gpa.template.application.dtos.ProductDto;
import br.com.gpa.template.domain.models.Product;

import br.com.gpa.template.infrastructure.entities.ProductEntity;

import org.mapstruct.Mapper;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Mapper(componentModel = "spring")
public interface AutoMapper {

    ProductDto toProductDto(Product product);

    List<ProductDto> toProductDtoList(List<Product> products);

    List<Product> toProductList(List<ProductEntity> entities);

}

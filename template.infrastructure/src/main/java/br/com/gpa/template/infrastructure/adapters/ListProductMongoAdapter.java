package br.com.gpa.template.infrastructure.adapters;

import br.com.gpa.template.domain.interfaces.persistence.ListProductAdapter;
import br.com.gpa.template.domain.models.Product;
import br.com.gpa.template.infrastructure.entities.ProductEntity;
import br.com.gpa.template.infrastructure.repositories.ProductRepository;
import br.com.gpa.template.infrastructure.tools.EntityMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@RequiredArgsConstructor
public class ListProductMongoAdapter implements ListProductAdapter {

    public final ProductRepository repository;

    public final EntityMapper entityMapper;

    @Override
    public List<Product> findByName(String name) {
        List<ProductEntity> entities = repository.findByName(name);
        List<Product> products = entityMapper.toProductList(entities);
        return products;
    }
}

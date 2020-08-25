package br.com.gpa.template.infrastructure.repositories;

import br.com.gpa.template.infrastructure.entities.ProductEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, String> {

    List<ProductEntity> findByName(String name);

}

package br.com.gpa.template.infrastructure.entities;

import br.com.gpa.template.domain.models.Product;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "product")
public class ProductEntity extends Product {

    @Id
    private String id;

}

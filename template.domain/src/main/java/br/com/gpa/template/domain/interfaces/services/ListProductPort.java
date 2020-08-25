package br.com.gpa.template.domain.interfaces.services;

import br.com.gpa.template.domain.exceptions.ProductNotFoundException;
import br.com.gpa.template.domain.models.Product;

import java.util.List;

public interface ListProductPort {

    List<Product> findProducts(String name) throws ProductNotFoundException;

}

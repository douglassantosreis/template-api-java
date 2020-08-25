package br.com.gpa.template.domain.interfaces.persistence;

import br.com.gpa.template.domain.models.Product;

import java.util.List;

public interface ListProductAdapter {

    List<Product> findByName(String name);

}

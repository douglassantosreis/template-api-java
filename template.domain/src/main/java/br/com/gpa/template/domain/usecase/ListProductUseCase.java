package br.com.gpa.template.domain.usecase;

import br.com.gpa.template.domain.interfaces.persistence.ListProductAdapter;
import br.com.gpa.template.domain.interfaces.services.ListProductPort;
import br.com.gpa.template.domain.exceptions.ProductNotFoundException;
import br.com.gpa.template.domain.models.Product;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ListProductUseCase implements ListProductPort {

    private final ListProductAdapter adapter;

    @Override
    public List<Product> findProducts(String name) throws ProductNotFoundException {
        List<Product> queryResult = adapter.findByName(name);

        if(queryResult.isEmpty()) {
            throw new ProductNotFoundException("Nenhum produto foi encontrado");
        }

        return  queryResult;
    }
}

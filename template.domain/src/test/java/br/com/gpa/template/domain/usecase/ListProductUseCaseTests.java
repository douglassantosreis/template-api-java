package br.com.gpa.template.domain.usecase;

import br.com.gpa.template.domain.exceptions.ProductNotFoundException;

import br.com.gpa.template.domain.interfaces.persistence.ListProductAdapter;
import br.com.gpa.template.domain.interfaces.services.ListProductPort;
import br.com.gpa.template.domain.models.Product;

import com.flextrade.jfixture.JFixture;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class ListProductUseCaseTests {

    JFixture fixture = new JFixture();

    @Mock
    ListProductAdapter adapter;

    @AfterEach
    public void tearDown() {
        Mockito.reset(adapter);
    }

    @Test
    public void NoProductFoundTest() {
        List<Product> emptyList = fixture.collections().createCollection(Product.class,0).stream().collect(Collectors.toList());

        when(adapter.findByName(Mockito.any(String.class)))
                .thenAnswer(i -> emptyList);

        ListProductPort useCase = new ListProductUseCase(adapter);
        Assertions.assertThrows(ProductNotFoundException.class, () -> useCase.findProducts(""));
    }

    @Test
    public void ProductFoundTest() throws ProductNotFoundException {
        List<Product> products = fixture.collections().createCollection(Product.class).stream().collect(Collectors.toList());

        when(adapter.findByName(Mockito.any(String.class)))
                .thenAnswer(i -> products);

        ListProductPort useCase = new ListProductUseCase(adapter);

        List<Product> results = useCase.findProducts("");
        Assertions.assertEquals(products, results);
    }

}

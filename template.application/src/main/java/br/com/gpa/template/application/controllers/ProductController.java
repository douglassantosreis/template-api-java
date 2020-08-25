package br.com.gpa.template.application.controllers;

import br.com.gpa.template.application.dtos.ProductDto;
import br.com.gpa.template.application.tools.AutoMapper;

import br.com.gpa.template.domain.exceptions.ProductNotFoundException;
import br.com.gpa.template.domain.interfaces.services.ListProductPort;
import br.com.gpa.template.domain.models.Product;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProductController {

    private final ListProductPort port;

    private final AutoMapper autoMapper;

    @GetMapping("/product")
    public ResponseEntity getAll(@RequestParam(value = "name", required = false) String name) throws ProductNotFoundException {
        List<Product> products = port.findProducts(name);
        List<ProductDto> dtos = autoMapper.toProductDtoList(products);
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }

}

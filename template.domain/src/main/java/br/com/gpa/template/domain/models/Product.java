package br.com.gpa.template.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String id;
    private String name;
    private String code;
    private double price;

}

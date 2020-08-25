package br.com.gpa.template.domain.exceptions;

public class ProductNotFoundException extends NotFoundException {

    public ProductNotFoundException(String message) {
        super(message);
    }

}

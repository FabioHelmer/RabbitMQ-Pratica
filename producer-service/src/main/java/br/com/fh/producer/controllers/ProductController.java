package br.com.fh.producer.controllers;

import br.com.fh.producer.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.rabbitmq.dtos.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping(value = "/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<String> product(@RequestBody ProductDTO dto) {
        service.createProduct(dto);
        return ResponseEntity.status(CREATED).build();
    }


}

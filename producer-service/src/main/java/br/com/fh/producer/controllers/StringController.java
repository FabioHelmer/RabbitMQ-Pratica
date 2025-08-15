package br.com.fh.producer.controllers;

import br.com.fh.producer.services.StringService;
import lombok.RequiredArgsConstructor;
import org.rabbitmq.dtos.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/producer")
@RequiredArgsConstructor
public class StringController {

    private final StringService stringService;

    @GetMapping
    public ResponseEntity<String> producer(@RequestParam("message") String message) {
        stringService.produce(message);
        var product  = new ProductDTO();
        return ResponseEntity.ok().body("Sending message");
    }


}

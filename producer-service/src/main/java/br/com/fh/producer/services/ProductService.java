package br.com.fh.producer.services;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.rabbitmq.dtos.ProductDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static org.rabbitmq.constantes.RabbitMQConstantes.EXG_NAME_MARKETPLACE;
import static org.rabbitmq.constantes.RabbitMQConstantes.RK_PRODUCT_LOG;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProductService {

    private final RabbitTemplate rabbitTemplate;


    public void createProduct(ProductDTO productDTO){
        log.info("Sending a message to exchenge "+productDTO.toString());
        rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, productDTO);

    }

}

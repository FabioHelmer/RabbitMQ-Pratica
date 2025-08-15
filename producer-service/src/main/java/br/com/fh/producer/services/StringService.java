package br.com.fh.producer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static org.rabbitmq.constantes.RabbitMQConstantes.EXG_NAME_MARKETPLACE;
import static org.rabbitmq.constantes.RabbitMQConstantes.RK_PRODUCT_LOG;


@Slf4j
@Service
@RequiredArgsConstructor
public class StringService {
    private final RabbitTemplate rabbitTemplate;

    public void produce(String message){
        log.info("received message "+ message);
        rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, message);
    }

}

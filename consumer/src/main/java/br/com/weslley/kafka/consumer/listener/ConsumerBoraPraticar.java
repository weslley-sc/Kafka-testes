package br.com.weslley.kafka.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerBoraPraticar {

    private final Logger logger = LoggerFactory.getLogger((ConsumerBoraPraticar.class));

    @KafkaListener(topics = "${topic.bora-praticar}", groupId = "group-id")
    public void consume(String message) throws IOException {
        logger.info(
                String.format("#### -> Consumed message %s", message)
        );
    }
}

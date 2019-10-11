package com.hp.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xiaodong
 * @title
 * @date 2019/10/11 15:42
 * @desc
 */
@Component
@Slf4j
public class MqReceiver {

    @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    public void process(String message){
            log.info("MqReceiver:{}",message);
    }
}

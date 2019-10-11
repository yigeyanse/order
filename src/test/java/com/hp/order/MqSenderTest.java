package com.hp.order;

import org.apache.commons.lang.time.DateFormatUtils;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author xiaodong
 * @title 发送消息测试
 * @date 2019/10/11 15:46
 * @desc
 */
@Component
public class MqSenderTest extends OrderApplicationTests{

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue","当前时间：" + DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
    }
}

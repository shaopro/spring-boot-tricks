package com.github.tricks.event.handler;

import com.github.tricks.event.CommonEvent;
import com.github.tricks.event.SmartEvent;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author 石少东
 * @date 2020-11-11 13:19
 * @since 1.0
 */

@Slf4j
@Component
public class SmartEventListener {

    @Order(3)
    @SneakyThrows
    @EventListener
    public void listener1(SmartEvent event) {
        System.out.println("-----------CommonEvent-1-----------" + event.getData());
        TimeUnit.SECONDS.sleep(1);
    }

    @Order(2)
    @SneakyThrows
    @EventListener
    public void listener2(SmartEvent event) {
        System.out.println("-----------CommonEvent-2-----------" + event.getData());
        TimeUnit.SECONDS.sleep(1);
    }

}

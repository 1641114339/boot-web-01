package com.zhp.bootweb01.actuator.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
//只需要继承抽象父类实现方法即可
public class MyHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String, Object> map = new HashMap<>();
        if(1==1){
            builder.status(Status.UP);
            map.put("msg","it's fine");
        }
        else {
            builder.status(Status.OUT_OF_SERVICE);
            map.put("error","超时");
        }
        builder.withDetail("msgs","nicetry!").withDetails(map);
    }
}

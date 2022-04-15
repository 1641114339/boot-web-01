package com.zhp.bootweb01.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
@Endpoint(id = "myservice")
public class MyEndpoint {
    @ReadOperation
    public Map getInfo(){
        return Collections.singletonMap("msg","read msg..");
    }
    @WriteOperation
    public void writeInfo(){
        System.out.println("stop..");
    }
}

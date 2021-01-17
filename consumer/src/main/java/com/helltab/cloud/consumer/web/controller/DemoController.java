package com.helltab.cloud.consumer.web.controller;

import com.helltab.cloud.rpcapi.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rpc")
public class DemoController {
    @DubboReference(check = false)
    DemoService demoService;

    @RequestMapping("/test")
    public String test(String methodName) {
        return demoService.invoke(methodName);
    }
}

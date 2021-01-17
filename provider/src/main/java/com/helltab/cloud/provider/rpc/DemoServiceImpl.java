package com.helltab.cloud.provider.rpc;

import com.helltab.cloud.rpcapi.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String invoke(String name) {
        return "方法< " + name + " >正在被调用";
    }
}

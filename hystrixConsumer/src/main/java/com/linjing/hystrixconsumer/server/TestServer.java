package com.linjing.hystrixconsumer.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cxc
 * @date 2019/1/13 16:31
 */
//服务名称 注解只能放在类上
@Component
@FeignClient(value = "Testing-service", fallback = TestServiceFallback.class)
public interface TestServer {

    @RequestMapping("test")
    String index();


}

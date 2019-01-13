package com.linjing.hystrixconsumer.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cxc
 * @date 2019/1/13 16:31
 */
@Service
public class TestServerImpl {
    @Autowired
    private TestServer testServer;

    @HystrixCommand(commandProperties = {
            //设置熔断
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            //时间滚动中最小请求参数，只有在一个统计窗口内处理的请求数量达到这个阈值，才会进行熔断与否的判断
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            //休眠时间窗
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "20000"),
            //错误百分比，判断熔断的阈值，默认值50，表示在一个统计窗口内有50%的请求处理失败，会触发熔断
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "40")})
    public String index() {
        return testServer.index();
    }
}

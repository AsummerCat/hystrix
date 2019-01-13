package com.linjing.hystrixconsumer.server;

import org.springframework.stereotype.Component;

@Component
class TestServiceFallback implements TestServer {
    @Override
    public String index() {
        return "请稍后再试~~~";
    }
}

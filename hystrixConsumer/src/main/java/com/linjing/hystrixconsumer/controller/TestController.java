package com.linjing.hystrixconsumer.controller;

import com.linjing.hystrixconsumer.server.TestServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cxc
 * @date 2019/1/13 16:27
 */
@RestController
public class TestController {
    @Autowired
    private TestServerImpl testServer;

    @RequestMapping("index")
    public String index() {
        return testServer.index();
    }
}

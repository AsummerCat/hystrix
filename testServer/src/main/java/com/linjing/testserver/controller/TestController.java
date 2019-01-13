package com.linjing.testserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author cxc
 * @date 2019/1/13 16:07
 */
@RestController
public class TestController {

    @RequestMapping(value = "test")
    public String test(HttpServletRequest request) throws Exception {
        int port = request.getLocalPort();
        //Thread.sleep(300000);
        return "测试接口成功当前提供服务的端口为:" + port;
    }
}

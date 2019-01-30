package com.demo.eureka.invoker.feignapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * PersonClient
 * 使用feign客户端,需要指明服务名称
 * @author 10905 2019/1/30
 * @version 1.0
 */
@FeignClient("provider")
public interface PersonClient {
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    String hello();
}

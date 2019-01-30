package com.demo.eureka.invoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaInvokerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaInvokerApplication.class, args);
        System.out.println("-----------------------自定义负载均衡70%----------------------------@EnableDiscoveryClient");
        System.out.println("服务调用者: http://localhost:9000/router");
        System.out.println("使用spring封装LoadBalancerClient: http://localhost:9000/userLb");
        System.out.println("使用原生ribbon: http://localhost:9000/defaultValue");
        System.out.println("或者自定义拦截会重定向的: http://localhost:9000/lanJie");

        System.out.println("feign客户端的调用: http://localhost:9000/invokerHello");

    }

}


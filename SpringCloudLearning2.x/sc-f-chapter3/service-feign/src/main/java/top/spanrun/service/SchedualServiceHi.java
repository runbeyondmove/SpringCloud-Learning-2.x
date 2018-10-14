package top.spanrun.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title：
 * @description：使用feign来调用服务
 * @author： LJR
 * @created： 2018/10/13
 * @version： 1.0.0
 */
// 注意是定义为接口
// 指定feign调用哪个服务,name对应调用服务的spring.application.name
@FeignClient(name = "service-hi")
@Service
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi") //指定调用service-hi服务的hi请求
    // 必须使用RequestParam注解，并且指定value参数
    //String sayHiFromClientOne(@RequestParam(value = "name") String name);// 定义为接口类型的，不用具体实现
    String sayHiFromClientOne(String name);// 定义为接口类型的，不用具体实现
}

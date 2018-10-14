package top.spanrun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @title：
 * @description：使用Ribbon结合RestTemplate调用服务
 * @author： LJR
 * @created： 2018/10/13
 * @version： 1.0.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHi(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}

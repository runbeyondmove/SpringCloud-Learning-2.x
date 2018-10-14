package top.spanrun.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "hiError") // 指定错误时的处理方法
    public String sayHi(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    private String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}

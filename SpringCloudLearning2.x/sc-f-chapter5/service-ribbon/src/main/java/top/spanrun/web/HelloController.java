package top.spanrun.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.spanrun.service.HelloService;

/**
 * <p>Title         :<br/></p>
 * <p>Description   :<br/></p>
 * <p>
 * Created by LJR on 2018/10/13.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/sayHi")
    public String sayHi(String name){
        return helloService.sayHi(name);
    }

}



package top.spanrun.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.spanrun.service.SchedualServiceHi;

/**
 * @title：
 * @description：
 * @author： LJR
 * @created： 2018/10/13
 * @version： 1.0.0
 */
@RestController
public class HelloController {

    // 编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    // 编译器报错，在service添加Service注解就不报错了
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/sayHi")
    public String sayHi(String name){
       return schedualServiceHi.sayHiFromClientOne(name);
    };
}

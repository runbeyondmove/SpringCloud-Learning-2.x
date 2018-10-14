package top.spanrun.service;

import org.springframework.stereotype.Component;

/**
 * @title：
 * @description：断路器处理类，记得要实现接口
 * @author： LJR
 * @created： 2018/10/14
 * @version： 1.0.0
 */
@Component //记得要注入IOC
public class SchedualServiceHiHystrix implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

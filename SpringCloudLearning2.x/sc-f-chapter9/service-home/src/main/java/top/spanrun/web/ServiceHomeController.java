package top.spanrun.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @title：
 * @description：
 * @author： LJR
 * @created： 2018/10/20
 * @version： 1.0.0
 */
@RestController
public class ServiceHomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceHomeController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="/hi")
    public String info(){
        LOGGER.info("calling trace service-home");

        return "i am service-home";
    }

    @RequestMapping(value = "home")
    public String sayHome(){
        LOGGER.info("sayHome is being called");

        return restTemplate.getForObject("http://localhost:8078/sayHi",String.class);
    }


}


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
public class ServiceHiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceHiController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="/callHome")
    public String callHome(){
        LOGGER.info("calling trace service-hi");

        return restTemplate.getForObject("http://localhost:8079/home",String.class);
    }

    @RequestMapping(value = "sayHi")
    public String sayHi(){
        LOGGER.info("calling trace service-hi  ");

        return "i am service-hi";
    }


}


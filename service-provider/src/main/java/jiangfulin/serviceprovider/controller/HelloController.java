package jiangfulin.serviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/service/hello")
    public String hello(){
        //进行业务处理，省略
        return "Hello,Spring Cloud!";
    }
}

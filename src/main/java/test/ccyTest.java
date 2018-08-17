package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class ccyTest {

	@RequestMapping(value="/")//是springmvc中的注解
    String home(){
        return "helloworld";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ccyTest.class, args);
    }

}
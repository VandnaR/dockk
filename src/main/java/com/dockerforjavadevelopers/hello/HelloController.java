package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	@Value(value="${spring.msg}")
	private String amountlowmsg;
    @RequestMapping("/")
    public String index() {
        return amountlowmsg;
    }
    
}

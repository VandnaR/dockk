package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
    
	@Value("${DOCKER_ENV_VARIABLE:default}")
	private String amountlowmsg;
    @RequestMapping(value="/docker-env",method=RequestMethod.GET)
	
    public String index() {
        return amountlowmsg;
    }
    
}


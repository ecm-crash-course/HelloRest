package it.sistinf.crash.hellorest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

    @RequestMapping(value="/think", method=RequestMethod.GET)
    public String requestMethodName(@RequestParam (value = "answer", defaultValue="42") String param) {
        return String.format("The answer is %s!",param);
    }

}
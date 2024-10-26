package com.company.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class SampleController {
    @GetMapping("/{name}/{city}")
    public String sayHello(@PathVariable("name") String name, @PathVariable("city") String city) {
        RestTemplate restTemplate = new RestTemplate();
        return "Hello " + name + " from " + city;
    }
}

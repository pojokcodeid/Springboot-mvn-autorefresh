package com.pcode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "Hello World 3";
    }

}

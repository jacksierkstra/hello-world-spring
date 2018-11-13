package com.example.helloworldspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public Data helloWorld() {
        return new Data("Hello World!");
    }

    private class Data {

        private final String message;

        public Data(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}

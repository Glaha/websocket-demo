package com.glaha.demo.websocket.controller.http;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/http")
public class RestController {

    @RequestMapping("/test")
    public String test() {
        return "http ok";
    }

}

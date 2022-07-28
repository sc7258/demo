package com.sc7258.demo.controller;

import com.sc7258.demo.service.firstService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class firstController {

    //private final firstService firstService;
    private final firstService firstService;

    //
//    public firstController(firstService firstService) {
//        this.firstService = firstService;
//    }

    @GetMapping("/first")
    public Map<String, Object> firstController(){
        return firstService.getFirstData();
    }
}

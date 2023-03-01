package com.systems62.renovatetest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleRestController {
    
    @GetMapping
    public ResponseEntity<String> sample() {
        return ResponseEntity.ok("Hello, this is a sample for renovate");
    }


}

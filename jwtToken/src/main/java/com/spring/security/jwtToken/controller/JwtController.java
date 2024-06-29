/**
 * @author Wondafrash
 * @Date 6/29/2024
 */
package com.spring.security.jwtToken.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {
    @GetMapping("/hi")
    public String getString(){
       return "my name is ...";
    }

}

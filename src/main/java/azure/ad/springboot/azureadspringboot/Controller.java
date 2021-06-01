package azure.ad.springboot.azureadspringboot;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @PreAuthorize("hasRole('springadlogginusersgrp')")
    @RequestMapping("/springadlogginusersgrp")
    public String groupOne() {
        return "Hello Group 1 Users!";
    }
    @PreAuthorize("hasRole('ROLE_group2')")
    @RequestMapping("/Group2")
    public String groupTwo() {
        return "Hello Group 2 Users!";
    }
}

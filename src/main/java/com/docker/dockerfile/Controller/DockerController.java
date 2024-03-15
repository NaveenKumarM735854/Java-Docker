package com.docker.dockerfile.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController
{
    @GetMapping("/")
    public String Welcome()
    {
        return "Hello ,Weclome";
    }

}

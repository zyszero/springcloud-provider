package io.github.zyszero.phoenix.sc.provider;

import io.github.zyszero.phoenix.sc.contract.HelloServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zyszero
 * @Date: 2024/8/12 19:50
 */
@RestController
public class HelloController implements HelloServiceClient {

    @GetMapping("/api/hello")
    public String hello() {
        return "hello spring cloud";
    }

    @GetMapping("/api/a")
    public String a(@RequestParam("name") String name) {
        return "hello a, " + name;
    }

    @GetMapping("/api/b")
    public String b(@RequestParam("name") String name) {
        return "hello b, " + name;
    }
}

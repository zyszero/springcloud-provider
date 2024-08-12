package io.github.zyszero.phoenix.sc.contract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zyszero
 * @Date: 2024/8/12 20:24
 */
public interface HelloServiceClient {

    @GetMapping("/api/hello")
    String hello();

    @GetMapping("/api/a")
    String a(@RequestParam("name") String name);

    @GetMapping("/api/b")
    String b(@RequestParam("name") String name);
}

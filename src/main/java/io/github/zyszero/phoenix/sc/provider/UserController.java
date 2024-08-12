package io.github.zyszero.phoenix.sc.provider;

import io.github.zyszero.phoenix.sc.contract.UserServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zyszero
 * @Date: 2024/8/12 19:50
 */
@RestController
public class UserController implements UserServiceClient {


    @Override
    @GetMapping("/api/user/list")
    public String list(String name) {
        return "list user, " + name;
    }

    @Override
    @GetMapping("/api/user/find")
    public String find(String name) {
        return "find user, " + name;
    }
}

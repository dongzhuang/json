package com.dong.json;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUserById() {
        User user = new User();
        user.setUsername("董状");
        user.setAddress("后王寿村");
        user.setBirthday(LocalDateTime.now());
        user.setToday(new Date());
        user.setAge(10);
        return user;
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        System.out.println(user);
    }

    @PostMapping("/user2")
    public void addUser2(User user) {
        System.out.println(user);
    }

}

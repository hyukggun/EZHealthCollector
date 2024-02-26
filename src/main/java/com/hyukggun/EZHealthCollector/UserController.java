package com.hyukggun.EZHealthCollector;

import com.hyukggun.EZHealthCollector.model.User;
import com.hyukggun.EZHealthCollector.model.user.UserDTO;
import com.hyukggun.EZHealthCollector.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findUserById(id)
                .orElse(null); // 실제로는 적절한 예외 처리가 필요합니다.
    }

    @PostMapping
    public User createUser(@RequestBody UserDTO user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

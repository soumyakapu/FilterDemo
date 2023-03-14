package filterdemo.controller;

import filterdemo.entity.User;
import filterdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @GetMapping("/get")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("/create")
    public User createUser(User user){
        return userService.createUser(user);
    }
}

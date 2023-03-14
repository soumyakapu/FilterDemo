package filterdemo.service;

import filterdemo.controller.UserController;
import filterdemo.entity.User;
import filterdemo.repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    Logger logger= LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepo userRepo;
   public List<User> getUsers(){
        return userRepo.findAll();
    }
    public User createUser(User user){
       return userRepo.save(user);
    }
}

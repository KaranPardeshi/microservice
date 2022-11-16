package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = List.of(
            new User(1311l,"Karan Pardeshi","999999999"),
            new User(1312l,"Ravi Pardeshi","8888888888"),
            new User(1314l,"Amit Bothe","7777777777")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}

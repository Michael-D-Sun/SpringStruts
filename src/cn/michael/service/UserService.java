package cn.michael.service;

import cn.michael.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> getAll();
}

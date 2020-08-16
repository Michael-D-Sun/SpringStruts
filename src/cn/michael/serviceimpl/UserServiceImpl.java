package cn.michael.serviceimpl;

import cn.michael.dao.UserDao;
import cn.michael.entity.User;
import cn.michael.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAll() {
        List<User> users = userDao.getAll();
        return users;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}

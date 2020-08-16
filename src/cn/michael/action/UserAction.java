package cn.michael.action;

import cn.michael.entity.User;
import cn.michael.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserAction {
    private List<User> list;

    public UserService getUserService() {
        return userService;
    }

    private UserService userService;

    public String list(){
        list = userService.getAll();
        System.out.println(list);
        return "success";
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<User> getList() {
        return list;
    }
}

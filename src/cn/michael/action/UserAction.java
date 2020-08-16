package cn.michael.action;

import cn.michael.entity.User;
import cn.michael.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("userAction")
@Scope("prototype")
public class UserAction {

    private List<User> list;
    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public String list(){
        list = userService.getAll();
        System.out.println(list);
        return "success";
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        UserAction userAction = new UserAction();
        userAction.setUserService(userService);
        userAction.list();
        System.out.println(userAction.list);

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

package com.codenvy.example.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
  
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String Login(Model model) {
        buildUserList(model);
        //model.addAttribute("title", "Users List - Thymeleaf");
        return "thymeleaf/login";
    }  

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String findUsersThymeLeaf(Model model) {
        buildUserList(model);
        model.addAttribute("title", "Users List - Thymeleaf");
        return "thymeleaf/users";
    }

    private void buildUserList(Model model) {
        List<User> users = new ArrayList<User>();
        users.add(new User("Deepak", "Gupta"));
        users.add(new User("Pulkit", "Singhal"));
        users.add(new User("John", "Doe"));
        users.add(new User("Mickey", "Mouse"));
        users.add(new User("Donald", "Duck"));
        model.addAttribute("users", users);
    }


}

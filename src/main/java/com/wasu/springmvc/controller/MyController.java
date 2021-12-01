package com.wasu.springmvc.controller;

import com.wasu.springmvc.domain.User;
import com.wasu.springmvc.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MyController {
    /**
     * 使用@RequestMapping 映射请求的URL
     * @return
     */
    @Autowired
    private UserService userService;

    @RequestMapping("/helloworld")
    public String hello() {
        System.out.println("Hello World!");
        return "success";
    }

    @RequestMapping("/login")
    public ModelAndView login(User user, HttpSession session) {
        if(userService.queryUser(user.getName(), user.getPassword()))
            session.setAttribute("username", user.getName());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/listAllUsers")
    @ResponseBody
    public List<User> listAllUsers() {
        List<User> users = userService.queryAllUsers();
        return users;
    }

    @RequestMapping("/addUser")
    public ModelAndView addUser(User user) {
        System.out.println(user.getName() + " " + user.getPassword());
        ModelAndView mv = new ModelAndView();

        int rows = userService.addUser(user);
        String msg = "注册失败！";
        if(rows > 0 ){
            //注册成功， 给用户成功的数据和视图
            msg = "注册成功！";
        }
        mv.addObject("msg", user.getName()+"," + msg);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/test")
    public ModelAndView test(HttpServletRequest request, User user) {
        request.setAttribute("name", user.getName());
        Logger logger = LogManager.getLogger();
        logger.info("user name: " + user.getName());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
}

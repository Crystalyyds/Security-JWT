package com.github.sgblug.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 20312
 * @author 2022/8/24 9:40
 */
@Controller
public class UIController {
    @RequestMapping({"/","/login"})
    public String index(){
        return "login";
    }
    /**
     *
     * @return
     */
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    /**
     *
     * @return
     */
    @GetMapping("/menus")
    public String menus(){
        return "templates/menus";
    }
    /**
     *
     * @return
     */
    @GetMapping("/others")
    public String other(){
        return "others";
    }
    /**
     *
     * @return
     */
    @GetMapping("/blogs")
    public String role(){
        return "blogs";
    }
    /**
     *
     * @return
     */
    @GetMapping("/users")
    public String users(){
        return "users";
    }
}

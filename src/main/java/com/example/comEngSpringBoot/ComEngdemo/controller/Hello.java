package com.example.comEngSpringBoot.ComEngdemo.controller;

import com.example.comEngSpringBoot.ComEngdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class Hello {

    @RequestMapping("/")
    public String hello() {
        String str = "<h1> Hello World </h1>";
        String img = "<img src=\"https://ticaret.mrooms.net/pluginfile.php/2674/user/icon/snap/f1?rev=1623\">";
        str += "<a href=\"about\">" + img + "About me </a>";

        return str;
    }

    @RequestMapping("/about")
    public String about() {
        String str = "<h1> This is ABOUT  ME</h1>";
        String img = "<img src=\"https://ticaret.mrooms.net/pluginfile.php/2674/user/icon/snap/f1?rev=1623\">";
        str += img + "lonely, retired  comedian  trying to be A  academician :) ";

        return str;
    }

    @PostMapping("/user")
    public User getUser() {
        User myuser = new User("Mustafa", "mckasapbasi@ticaret.edu.tr");
        myuser.setId(UUID.randomUUID().toString());
        return myuser;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String id) {

        User myuser = new User("Mustafa", "mckasapbasi@ticaret.edu.tr");
        myuser.setId(id);
        return myuser;

    }

    @GetMapping("/query")
    public String myQuery(@RequestParam(name = "name") String name,
                          @RequestParam(name = "id") String id,
                          @RequestParam(name = "email",
                                  required = false, defaultValue = "") String email) {

    return "<br> user name: " +name + "<br> id: " +id +"<br> user email: " +email ;
    }

}

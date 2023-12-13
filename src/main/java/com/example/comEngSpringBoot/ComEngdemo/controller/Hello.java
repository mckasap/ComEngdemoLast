package com.example.comEngSpringBoot.ComEngdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Hello {

    @RequestMapping("/")
    public String hello() {
        String str= "<h1> Hello World </h1>";
        String img= "<img src=\"https://ticaret.mrooms.net/pluginfile.php/2674/user/icon/snap/f1?rev=1623\">";
        str+="<a href=\"about\">"+img+ "About me </a>";

        return str;
    }
    @RequestMapping("/about")
    public String about() {
        String str= "<h1> This is ABOUT  ME</h1>";
        String img= "<img src=\"https://ticaret.mrooms.net/pluginfile.php/2674/user/icon/snap/f1?rev=1623\">";
        str+=img+ "A lonely academician retired from comedian :) ";

        return str;
    }

}

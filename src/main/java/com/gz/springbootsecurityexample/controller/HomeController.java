package com.gz.springbootsecurityexample.controller;

import com.gz.springbootsecurityexample.domain.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaozefeng
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息,只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }
}

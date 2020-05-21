package com.wy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: 王阳
 * Date:     2020/5/20 15:46
 * Description:视图解析器
 */
@Controller
public class MyHandler{

    /**
     * 业务方法
     * 使用ModelAndView完成数据传递、视图解析
     */
    @RequestMapping("/modelAndViewTest")
    public ModelAndView modelAndViewTest(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Jack");
        modelAndView.setViewName("show");
        return modelAndView;
    }
}

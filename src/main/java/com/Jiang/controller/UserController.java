package com.Jiang.controller;

import com.Jiang.pojo.User;
import com.Jiang.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    //1.登录
    @RequestMapping("/login")
    public String Login(HttpSession httpSession,User user){
        System.out.println("登录");
        String userName=user.getUserName();
        String password=user.getPassword();
        Map m=new HashMap();
        m.put("userName",userName);
        List<User> users=userService.Login(m);
        if(users.size()!=0&&users.get(0).getPassword().equals(password)){
            System.out.println("登录成功!");
            httpSession.setAttribute("Login",userName);
            return "redirect:/book/AllBook";
        }

        return "redirect:/loginUI";    //转发到主页
    }
    //2.注销
    @RequestMapping("/logout")
    public String Logout(HttpSession httpSession){
        httpSession.removeAttribute("Login");
        return "redirect:/loginUI";
    }
    //3.登录界面
    @RequestMapping("/loginUI")
    public String LoginUI(){
//        return "login";
        return "redirect:/";
    }

//    4.修改密码
    @RequestMapping("/toUpdataPassword")
    public String toUpdataPassword(){
        return "toUpdataPassword";
    }
    @RequestMapping("/UpdataPassword")
    public String UpdataPassword(HttpSession httpSession,String password){
        String userName= (String) httpSession.getAttribute("Login");
        Map m=new HashMap();
        m.put("userName",userName);
        m.put("password",password);
        userService.UpdataPassword(m);
        return "redirect:/loginUI";
    }
//5.验证
    @ResponseBody
    @RequestMapping("/checkOldPassword")
    public String checkOldPassword(HttpSession session, String oldPassword, HttpServletResponse response){
//        response.setContentType("text/plain; charset=UTF-8");//设置返回值编码放到最顶部，一定要在out前。
//        response.setCharacterEncoding("UTF-8");//设置返回值编码放到最顶部，一定要在out前。
        String userName= (String) session.getAttribute("Login");
        Map m=new HashMap();
        m.put("userName",userName);
        String password=userService.Login(m).get(0).getPassword();
        if(password.equals(oldPassword)){
            return "√";
        }
            return "×";

    }
}

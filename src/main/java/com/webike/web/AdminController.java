package com.webike.web;

import com.webike.dto.JsonResult;
import com.webike.dto.Page;
import com.webike.enums.ResultEnum;
import com.webike.pojo.Admin;
import com.webike.pojo.Place;
import com.webike.service.AdminService;
import com.webike.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**管理员controller
 * Created by Ming on 2018/2/8.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    //跳转到首页
    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    //验证登陆
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Admin admin, Model model, HttpSession session){
        String message = adminService.checkUserPwd(admin);
        if("成功".equals(message)) {
            //注入Session
            Admin realAdmin = adminService.findByUsername(admin.getaUsername());

            session.setAttribute("admin",realAdmin);
            //更新登陆的时间
            admin.setaLoginTime(new Date());
            admin.setaUpdateTime(new Date());
            admin.setaPassword(null);
            adminService.upDate(admin);
            return "redirect:index";
        }

        model.addAttribute("msg",message);
        return "forward:/login.jsp";
    }
    //退出登陆
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login.jsp";
    }

    //跳转到修改密码的页面
    @RequestMapping("/rePassword")
    public String rePassword(){
        return "rePassword";
    }
    //修改提交的密码
    @RequestMapping("/submitResetPwd")
    @ResponseBody
    public JsonResult submitResetPwd(String password, String newPassword,HttpSession httpSession){
        Admin admin = (Admin) httpSession.getAttribute("admin");
        if(!admin.getaPassword().equals(MD5Util.getMD5(password)))
            return new JsonResult(false,ResultEnum.OLD_PASSWORD_ERROR);
        admin.setaPassword(MD5Util.getMD5(newPassword));
        admin.setaUpdateTime(new Date());
        boolean isSuccess = adminService.upDate(admin);
        if(isSuccess) return new JsonResult(isSuccess, ResultEnum.UPDATE_SUCCESS);
        return new JsonResult(isSuccess, ResultEnum.UPDATE_FAIL);
    }

    //跳转到用户管理页面

    @RequestMapping("/adminManage")
    public String adminMange(){
        return "admin";
    }


    //显示用户页面
    @RequestMapping("/showAll")
    @ResponseBody
    public Page<Admin> showAll(Integer page, Integer rows){
        return adminService.findAllToPage(page,rows);
    }

    //删除用户
    @RequestMapping("/remove")
    @ResponseBody
    public JsonResult remove(Integer aid){
        return adminService.deleteById(aid);
    }

    // 加载服务点到表单下拉框 loadPlace
    @RequestMapping("/loadPlace")
    @ResponseBody
    public List<Place> loadPlace(){
        return adminService.loadPlace();
    }


    //回显用户表单
    @RequestMapping("/loadForm")
    @ResponseBody
    public Admin loadForm(String username){
        Admin admin = adminService.findByUsername(username);
        return admin;
    }


    //addOrUpdate
    @RequestMapping("/addOrUpdate")
    @ResponseBody
    public JsonResult addOrUpdate(MultipartFile adminIcon, Admin admin, HttpServletRequest request){
        if(admin.getAid() == null) return adminService.add(adminIcon,admin,request);
        return adminService.update(adminIcon,admin,request);

    }
















}

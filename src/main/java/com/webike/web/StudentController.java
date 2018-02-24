package com.webike.web;

import com.webike.dto.JsonResult;
import com.webike.dto.Page;
import com.webike.pojo.Student;
import com.webike.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Ming on 2018/2/9.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //跳转到student管理 jsp页面
    @RequestMapping("/studentManage")
    public String studentManage(){
        return "student";
    }

    //添加或更新一个学生
    @RequestMapping(value = "/addOrUpdate",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult add(MultipartFile studentIcon, Student student, HttpServletRequest request){
        if(student.getSid() == null || "".equals(student.getSid()))
        return studentService.add(studentIcon,student,request);
        return studentService.update(studentIcon,student,request);
    }

    //显示所有的学生
    @RequestMapping("/showAll")
    @ResponseBody
    public Page<Student> show(Integer page,Integer rows){
        return studentService.findAllToPage(page,rows);
    }

    //删除一个学生
    @RequestMapping(value = "/remove",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult remove( Integer sid){
        return studentService.removeById(sid);
    }

    //回显 指定一个student数据到student页面的弹出框表单中
    @RequestMapping("/loadForm")
    @ResponseBody
    public Student loadForm(Integer sid){
        return studentService.findById(sid);
    }








}

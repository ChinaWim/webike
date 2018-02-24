package com.webike.service.impl;

import com.webike.dao.StudentMapper;
import com.webike.dto.JsonResult;
import com.webike.dto.Page;
import com.webike.enums.ResultEnum;
import com.webike.pojo.Student;
import com.webike.pojo.StudentExample;
import com.webike.service.StudentService;
import com.webike.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/2/9.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student findBySno(String sno) {
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andSnoEqualTo(sno);
        List<Student> students = studentMapper.selectByExample(studentExample);
        if(students != null && students.size() > 0) return students.get(0);
        return null;
    }

    @Override
    public Page findAllToPage(Integer page, Integer rows) {
        Page<Student> sPage = new Page<>();
        List<Student> lists = studentMapper.findToPage((page-1)*rows,rows);
        sPage.setRows(lists);
        sPage.setTotal(studentMapper.countByExample(new StudentExample()));
        return sPage;
    }

    @Override
    public JsonResult add(MultipartFile studentIcon, Student student,HttpServletRequest request) {
        if(!studentIcon.isEmpty()){
            String path = FileUtil.uploadImage(studentIcon, "studentIcon", request);
            if(path == null) return new JsonResult(false, ResultEnum.UPLOAD_TYPE_ERROR);
            student.setsIcon(path);
        }

        student.setsCreateTime(new Date());
        student.setsUpdateTime(new Date());
        if(student.getsSex() == null) student.setsSex("男");
        try{
            int   i = studentMapper.insertSelective(student);
            return    i > 0 ?  new JsonResult(true, ResultEnum.ADD_SUCCESS)
                    : new JsonResult(false, ResultEnum.ADD_FAIL);
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult(false, ResultEnum.REPEAT_ERROR);
        }
    }

    @Override
    public JsonResult removeById(Integer sid) {
        if(sid == null) return new JsonResult(false, ResultEnum.DELETE_FAIL);
        int i = studentMapper.deleteByPrimaryKey(sid);
        return i > 0 ? new JsonResult(true, ResultEnum.DELETE_SUCCESS) : new JsonResult(false, ResultEnum.DELETE_FAIL);
    }

    @Override
    public Student findById(Integer sid) {
        if(sid != null){
            return studentMapper.selectByPrimaryKey(sid);
        }
        return null;
    }

    @Override
    public JsonResult update(MultipartFile studentIcon,Student student,HttpServletRequest request) {
        try{
            if(!studentIcon.isEmpty()){
                //更新首先要先删除原来的文件
                if(student.getsIcon() != null){
                    File file = new File(request.getServletContext().getRealPath("/" + student.getsIcon()));
                    if(file != null) file.delete();
                }
                String path = FileUtil.uploadImage(studentIcon, "studentIcon", request);
                if(path == null) return new JsonResult(false, ResultEnum.UPLOAD_TYPE_ERROR);
                student.setsIcon(path);
            }
            student.setsUpdateTime(new Date());
            int i = studentMapper.updateByPrimaryKeySelective(student);
            return i > 0 ? new JsonResult(false, ResultEnum.UPDATE_SUCCESS)
                    : new JsonResult(false, ResultEnum.UPDATE_FAIL);
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult(false, ResultEnum.SYSTEM_ERROR);
        }

    }


}

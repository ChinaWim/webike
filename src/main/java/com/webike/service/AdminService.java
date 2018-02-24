package com.webike.service;

import com.webike.dto.JsonResult;
import com.webike.dto.Page;
import com.webike.pojo.Admin;
import com.webike.pojo.Place;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Ming on 2018/2/9.
 */
public interface AdminService {


    //验证登陆
    public String checkUserPwd(Admin admin);

    //更新
    public boolean upDate(Admin admin);

    //
    public Admin findByUsername(String username);

    //显示所有用户用PageBean封装
    Page<Admin> findAllToPage(Integer page, Integer rows);

    JsonResult deleteById(Integer aid);

    List<Place> loadPlace();

    JsonResult update(MultipartFile adminIcon, Admin admin, HttpServletRequest request);

    JsonResult add(MultipartFile adminIcon, Admin admin, HttpServletRequest request);
}

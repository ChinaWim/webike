package com.webike.utils;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 542585138 on 2018/2/10.
 */
public class FileUtil {
    /**
     *
     * @param multipartFile 上传的文件
     * @param saveDir  在images文件夹下面的哪个文件夹
     * @param request
     * @return 返回一个文件路径 如果null则上传失败
     */
    public static String uploadImage(MultipartFile multipartFile,String saveDir, HttpServletRequest request){
            if(!multipartFile.getContentType().startsWith("image/"))
                return null;
            String filename = multipartFile.getOriginalFilename();
            String type = filename.substring(filename.lastIndexOf("."));
            String newFilename = UUIDUtil.getUUIDByTime()+type;
            String path = request.getServletContext().getRealPath("/images/"+saveDir)+"/"+newFilename;
            try{
                FileCopyUtils.copy(multipartFile.getInputStream(), new FileOutputStream(path));
                return "images/"+saveDir+"/"+newFilename;
            }catch (IOException e){
                e.printStackTrace();
                return null;
            }

    }
}

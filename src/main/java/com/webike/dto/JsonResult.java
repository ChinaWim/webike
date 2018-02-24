package com.webike.dto;

import com.webike.enums.ResultEnum;

/**
 * 返回给前端的json数据
 * Created by Ming on 2018/2/8.
 */
public class JsonResult {

    private boolean isSuccess;
    private String message;

    public JsonResult(boolean isSuccess,ResultEnum result){
        this.isSuccess = isSuccess;
        this.message = result.getMessage();
    }

    public JsonResult(){

    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

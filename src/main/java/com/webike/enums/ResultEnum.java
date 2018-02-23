package com.webike.enums;

/**
 * Created by 542585138 on 2018/2/8.
 * 状态码
 */
public enum ResultEnum {

    ADD_SUCCESS("添加成功！未显示请刷新。"),
    ADD_FAIL("添加失败！"),
    UPDATE_SUCCESS("更新成功！未显示请刷新。"),
    UPDATE_FAIL("更新失败！"),
    DELETE_SUCCESS("删除成功！未显示请刷新。"),
    DELETE_FAIL("删除失败!"),

    REPEAT_ERROR("失败！重复错误！"),
    UPLOAD_TYPE_ERROR("上传类型错误！"),

    NOT_FOUND_SNO("错误！未录入此学生!"),
    NOT_FOUND_BIKE("错误！未录入此单车!"),

    BIKE_BORROWED("错误！此单车正在借用!"),
    BIKE_REPAIR("错误！此单车需维修!"),
    BIKE_BREAKDOWN("错误！此单车已报废!"),

    OLD_PASSWORD_ERROR("原密码错误"),
    SYSTEM_ERROR("系统出错!请查看日志。");

    private String message;

    ResultEnum(String message){
        this.message = message;
    }


    public String getMessage() {
        return message;
    }
}

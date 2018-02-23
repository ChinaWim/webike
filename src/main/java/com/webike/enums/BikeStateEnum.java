package com.webike.enums;

/**
 * Created by 542585138 on 2018/2/13.
 */
public enum BikeStateEnum {
    AVAILABLE("未借"),
    BORROWED("已借"),
    REPAIR("需维修"),
    BREAKDOWN("报废");

    private String state;

    public String getState() {
        return state;
    }

    BikeStateEnum(String state) {
        this.state = state;
    }
}

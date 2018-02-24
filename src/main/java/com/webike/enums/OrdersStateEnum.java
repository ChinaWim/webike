package com.webike.enums;

/**
 * Created by Ming on 2018/2/13.
 */
public enum OrdersStateEnum {
    NOT_RETURN("未归还"),
    RETURN("归还,单车完好"),
    RETURN_REPAIR("归还,单车需维修"),
    RETURN_BREAKDOWN("归还,单车已报废");

    private String state;

    public String getState() {
        return state;
    }

    OrdersStateEnum(String state) {
        this.state = state;
    }
}

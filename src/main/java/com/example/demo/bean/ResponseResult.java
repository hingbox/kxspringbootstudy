package com.example.demo.bean;

/**
 * Created by Admin on 2018/10/18.
 */
public class ResponseResult {
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseResult() {
    }

    public ResponseResult(Integer code, String msg, Object data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;

    }
}

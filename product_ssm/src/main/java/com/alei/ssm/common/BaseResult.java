package com.alei.ssm.common;

import java.util.Map;

/**
 * base info to return
 *
 * @author admin
 * @create 2018-03-07 11:20
 **/
public class BaseResult {
    protected boolean success = false;
    protected String errorCode;
    protected String errorMsg;
    protected Map<?, ?> map;
    protected String msg;

    public Map<?, ?> getMap() {
        return map;
    }
    public void setMap(Map<?, ?> map) {
        this.map = map;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    public String getErrorMsg() {
        return errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}

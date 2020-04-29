package edu.tcu.cs.hogwartsartifactsonline.domain;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
    // status code, e.g. 200, 500 etc
    private int status;
    // success msg or error msg, e.g. delete success
    private String msg;

    // used to store the returned data, e.g. one user, a list of users
    private Object data;

    public Result(boolean b, int success, String find_all_success, List<Artifact> all) {
    }

    public Result(boolean b, int success, String save_success) {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public Result() {
    }
}

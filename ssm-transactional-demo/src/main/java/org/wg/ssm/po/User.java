package org.wg.ssm.po;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    public Integer id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 生日
     */
    private Date birthday;
    /**
     * 姓别
     */
    private String sex;

    private Date gmtModified;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
package org.neuedu.vue.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Column implements Serializable {
    private Integer id;
    private String colname;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date enabletime;
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname;
    }

    public Date getEnabletime() {
        return enabletime;
    }

    public void setEnabletime(Date enabletime) {
        this.enabletime = enabletime;
    }

    @Override
    public String toString() {
        return "Column{" +
                "id=" + id +
                ", colname='" + colname + '\'' +
                ", enabletime=" + enabletime +
                ", count=" + count +
                '}';
    }
}

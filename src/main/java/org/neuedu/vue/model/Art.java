package org.neuedu.vue.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Art {
    private Integer id;
    private String title;
    private Integer uid;
    private Integer cid;
    private String htmlcontent;
    private String mdcontent;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date publishtime;
    private Integer status;
    private User user;
    private Column column;


//    public void setNickName(String nickName){
//        user.setNickName(nickName);
//    }
//
//    public void setColname(String colname){
//        user.setNickName(colname);
//    }

//    public String getNickName(){
//        return user.getNickName();
//    }
//
//    public String getColname(){
//        return column.getColname();
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getHtmlcontent() {
        return htmlcontent;
    }

    public void setHtmlcontent(String htmlcontent) {
        this.htmlcontent = htmlcontent;
    }

    public String getMdcontent() {
        return mdcontent;
    }

    public void setMdcontent(String mdcontent) {
        this.mdcontent = mdcontent;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Art{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", uid=" + uid +
                ", cid=" + cid +
                ", htmlcontent='" + htmlcontent + '\'' +
                ", mdcontent='" + mdcontent + '\'' +
                ", publishtime=" + publishtime +
                ", status=" + status +
                ", user=" + user +
                ", column=" + column +
                '}';
    }
}

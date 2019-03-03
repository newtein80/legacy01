package com.lifesoft.legacy01.model.dto;

import java.sql.Date;

/**
 * MemberDTO
 */
public class MemberDTO {

    private String userid;
    private String passwd;
    private String name;
    private String email;
    private Date join_date;

    public MemberDTO() {
        super();
    }

    /**
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the join_date
     */
    public Date getJoin_date() {
        return join_date;
    }

    /**
     * @param join_date the join_date to set
     */
    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    @Override
    public String toString() {
        return "MemberDTO [userid=" + userid + ", passwd=" + passwd + ", name=" + name + ", email=" + email
				+ ", join_date=" + join_date + "]";
    }

    
}
package com.jay.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author xiang.wei
 * @create 2018/6/14 13:41
 */
@Entity
public class UserDetail  implements Serializable {

    private static final long serialVersionUID = 7411684544980704611L;

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = false)
    private String address;
    @Column(nullable = true)
    private String hobby;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public UserDetail(String userId, String address, String hobby) {
        this.userId = userId;
        this.address = address;
        this.hobby = hobby;
    }

    public UserDetail() {
    }
}

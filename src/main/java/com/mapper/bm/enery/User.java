package com.mapper.bm.enery;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
public class User {
    @Id
    private Integer id;
    @Column(name = "user_name")
    private String userName;
    private Integer user_age;
    private  String user_sex;
}

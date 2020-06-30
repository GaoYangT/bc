package com.mapper.bm.enery;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user_info")
public class User {
    @Id
    private Integer user_id;
    @Column(name = "user_name")
    private String userName;
    private Integer user_age;
    private  String user_sex;

}

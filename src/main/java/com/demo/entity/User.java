package com.demo.entity;

import com.lorne.mongo.framework.entity.MongoEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by lorne on 2017/6/12.
 */
@Document(collection = "t_user")
public class User extends MongoEntity{

    private Integer id;
    
    private String name;

    private String pwd;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

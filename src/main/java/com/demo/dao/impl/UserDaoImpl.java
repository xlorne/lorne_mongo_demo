package com.demo.dao.impl;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import com.lorne.mongo.framework.dao.impl.MongoBaseDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * Created by lorne on 2017/6/12.
 */
@Repository
public class UserDaoImpl extends MongoBaseDaoImpl<User> implements UserDao {



}

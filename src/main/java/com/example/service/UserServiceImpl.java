package com.example.service;

import com.example.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName :
 *
 * @author : LiXiaoKang
 * @date : 2019/12/20 10:57
 * Description :
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserInfoMapper userDao;
    //这里可能会报错，但是并不会影响

    @Override
    public List findAllUser(){
        return  userDao.findAllUser();
    }

}

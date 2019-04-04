package com.zs.ecms.service.fck;

import com.zs.ecms.mapper.fck.UserMapper;
import com.zs.ecms.pojo.fck.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{


    @Resource
    UserMapper um;

    @Override
    public User getUserByName(String username) {
        return um.getUserByName(username);
    }
}

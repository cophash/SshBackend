package com.zack.hans.project1.project1.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zack.hans.project1.project1.dao.UserMapper;
import com.zack.hans.project1.project1.vo.UserVo;

@Service
public class UserServer {
    @Autowired
    private UserMapper mapper;

    public UserVo getUserById(Long id) {
        return mapper.getUserById(id);
    }

}

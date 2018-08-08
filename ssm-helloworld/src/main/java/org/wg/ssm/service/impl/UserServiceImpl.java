package org.wg.ssm.service.impl;

import org.springframework.stereotype.Service;
import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.mapper.CrudMapper;
import org.wg.ssm.mapper.UserMapper;
import org.wg.ssm.po.User;
import org.wg.ssm.service.UserService;

import javax.annotation.Resource;


/**
 *
 */
@Service("userService")
public class UserServiceImpl extends BaseCrudServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public CrudMapper init() {
        return userMapper;
    }

    //    @Transactional//(propagation = Propagation.NESTED)
    @Override
    public void update(User user) throws ServiceException {

        userMapper.update(user);
        int i = 1 / 0;

    }
}

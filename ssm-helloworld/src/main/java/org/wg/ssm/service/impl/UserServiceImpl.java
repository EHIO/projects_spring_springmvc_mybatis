package org.wg.ssm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.mapper.CommodityMapper;
import org.wg.ssm.mapper.CrudMapper;
import org.wg.ssm.mapper.UserMapper;
import org.wg.ssm.po.Commodity;
import org.wg.ssm.po.User;
import org.wg.ssm.service.CommodityService;
import org.wg.ssm.service.UserService;
import org.wg.ssm.service.impl.BaseCrudServiceImpl;

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

    @Transactional//(propagation = Propagation.NESTED)
    @Override
    public void update(User user) throws ServiceException {
        try {
            userMapper.update(user);
            int i = 1 / 0;
        } catch (Exception e) {

            logger.error(e.getMessage(), e);
//            throw new RuntimeException();

        }

    }
}

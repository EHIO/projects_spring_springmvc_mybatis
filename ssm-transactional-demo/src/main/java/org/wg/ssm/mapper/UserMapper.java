package org.wg.ssm.mapper;

import org.wg.ssm.po.User;

public interface UserMapper extends CrudMapper {


    int update(User user);

}
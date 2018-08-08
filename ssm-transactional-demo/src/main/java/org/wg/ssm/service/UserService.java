package org.wg.ssm.service;


import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.po.User;

/**
 * @author wg
 */
public interface UserService extends BaseCrudService {


    /**
     * 测试事务回滚情况
     * 默认Spring事务只在发生未被捕获的RuntimeException才回滚
     */
    void update(User user) throws ServiceException;

}

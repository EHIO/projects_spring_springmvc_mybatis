package org.wg.ssm.service;

import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.po.Commodity;


/**
 * @author wg
 */
public interface CommodityService extends BaseCrudService {


    /**
     * 测试事务回滚情况
     * 默认Spring事务只在发生未被捕获的RuntimeException才回滚
     */
    void transactionaRollBack() throws Exception;

    void addStock() throws Exception;


    /**
     * 测试默认传播行为
     */
    void propagationRequired();

//    void subStock();
//
//    void addStock2();
//
//    void subStock2();

//    int updateStock(int value, int id);
}

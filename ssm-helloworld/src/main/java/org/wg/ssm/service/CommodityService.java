package org.wg.ssm.service;

import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.po.Commodity;


/**
 * @author wg
 */
public interface CommodityService extends BaseCrudService {


    void addStock();

    void subStock();

    void addStock2();

    void subStock2();

    int updateStock(int value, int id);
}

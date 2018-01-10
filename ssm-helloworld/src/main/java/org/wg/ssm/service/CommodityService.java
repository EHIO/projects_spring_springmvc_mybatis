package org.wg.ssm.service;

import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.po.Commodity;


/**
 * @author wg
 * @version 1.0
 * @date 2015-4-13下午3:48:09
 */
public interface CommodityService {

    public Commodity getById(Integer id) throws ServiceException;
}

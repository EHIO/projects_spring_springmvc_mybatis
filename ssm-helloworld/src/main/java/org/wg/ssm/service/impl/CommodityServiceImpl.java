package org.wg.ssm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.mapper.CommodityMapper;
import org.wg.ssm.po.Commodity;
import org.wg.ssm.service.CommodityService;

import javax.annotation.Resource;

/**
 * 商品管理
 */
@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {

    @Resource
    private CommodityMapper itemsMapper;

    @Transactional
    @Override
    public Commodity getById(Integer id) throws ServiceException {

        return itemsMapper.getById(id);
    }
}

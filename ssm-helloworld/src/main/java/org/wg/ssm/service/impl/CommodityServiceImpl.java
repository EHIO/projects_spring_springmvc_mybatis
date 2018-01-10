package org.wg.ssm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.mapper.CommodityMapper;
import org.wg.ssm.mapper.CrudMapper;
import org.wg.ssm.po.Commodity;
import org.wg.ssm.service.CommodityService;

import javax.annotation.Resource;

/**
 * 商品管理
 */
@Service("commodityService")
public class CommodityServiceImpl extends BaseCrudServiceImpl implements CommodityService {

    @Resource
    private CommodityMapper itemsMapper;

    @Override
    public CrudMapper init() {
        return itemsMapper;
    }
}

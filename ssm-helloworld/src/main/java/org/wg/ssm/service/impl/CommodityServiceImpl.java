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
    private CommodityMapper commodityMapper;

    @Override
    public CrudMapper init() {
        return commodityMapper;
    }

    @Transactional
    @Override
    public void addStock() {
        Commodity commodity = this.getById(1);
        Integer stockLimit = commodity.getStockLimit();
        logger.info("库存量：" + stockLimit);
        commodity.setStockLimit(stockLimit + 2);
        int count = this.updateById(commodity);
        logger.info("count:" + count);
        commodity = this.getById(1);
        stockLimit = commodity.getStockLimit();
        logger.info("库存量：" + stockLimit);
    }

    @Transactional
    @Override
    public void subStock() {
        Commodity commodity = this.getById(1);
        Integer stockLimit = commodity.getStockLimit();
        logger.info("库存量：" + stockLimit);
        commodity.setStockLimit(stockLimit - 1);
        int count = this.updateById(commodity);
        logger.info("count:" + count);
        commodity = this.getById(1);
        stockLimit = commodity.getStockLimit();
        logger.info("库存量：" + stockLimit);
    }

    @Transactional
    @Override
    public void addStock2() {
        Commodity commodity = this.getById(1);
        Integer stockLimit = commodity.getStockLimit();
        logger.info("库存量：" + stockLimit);
        int count = this.updateStock(2, 1);
        logger.info("count:" + count);
        commodity = this.getById(1);
        stockLimit = commodity.getStockLimit();
        logger.info("库存量：" + stockLimit);
    }

    @Transactional
    @Override
    public void subStock2() {
        Commodity commodity = this.getById(1);
        Integer stockLimit = commodity.getStockLimit();
        logger.info("库存量：" + stockLimit);
        int count = this.updateStock(-1, 1);
        logger.info("count:" + count);
        commodity = this.getById(1);
        stockLimit = commodity.getStockLimit();
        logger.info("库存量：" + stockLimit);
    }

    @Override
    public int updateStock(int value, int id) {

        return commodityMapper.updateStock(value, id);
    }
}

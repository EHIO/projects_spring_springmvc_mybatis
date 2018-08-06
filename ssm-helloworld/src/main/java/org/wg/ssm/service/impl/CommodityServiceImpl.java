package org.wg.ssm.service.impl;

import org.springframework.aop.framework.AopContext;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.mapper.CommodityMapper;
import org.wg.ssm.mapper.CrudMapper;
import org.wg.ssm.po.Commodity;
import org.wg.ssm.po.User;
import org.wg.ssm.service.CommodityService;
import org.wg.ssm.service.UserService;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 商品管理
 */
@Service("commodityService")
public class CommodityServiceImpl extends BaseCrudServiceImpl implements CommodityService {

    @Resource
    private CommodityMapper commodityMapper;

    @Resource
    private UserService userService;

    @Override
    public CrudMapper init() {
        return commodityMapper;
    }

    @Transactional//(rollbackFor = Exception.class)
    @Override
    public void transactionaRollBack() throws Exception {
        Commodity commodity = this.getById(1);
        Integer stockLimit = commodity.getStockLimit();
        logger.info("库存量：" + stockLimit);
        commodity.setStockLimit(stockLimit + 2);
        int count = this.updateById(commodity);
        throw new Exception("Exception");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addStock() throws Exception {
        Commodity commodity = this.getById(1);
        logger.info("库存量更新前：" + commodity.getStockLimit());

        int count = updateStock(2, commodity.getId());
//            int i = 1 / 0;
        logger.info("count:" + count);
        commodity = this.getById(1);
        logger.info("库存量更新后：" + commodity.getStockLimit());
    }

    @Transactional
    @Override
    public void propagationRequired()  {
        Commodity commodity = this.getById(1);
        logger.info("库存量更新前：" + commodity.getStockLimit());
        commodity.setGmtModified(new Date());
        updateById(commodity);

        User user = userService.getById(1);
        user.setGmtModified(commodity.getGmtModified());
//        try {

            userService.update(user);
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//        }
        System.out.println(111111);
    }

    //    @Override
//    @Transactional(propagation = Propagation.NEVER)
    public int updateStock(int value, int id) throws Exception {
//        try {
            int count = commodityMapper.updateStock(value, id);

            int i = 1 / 0;
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//            throw new Exception();
//        }
        return 0;
    }


}

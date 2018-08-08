package org.wg.ssm.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.po.Commodity;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
//@ContextConfiguration({"/spring/applicationContext-*.xml"})
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class CommodityServiceTest {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private CommodityService commodityService;




    @Test
    public void testTransactionaRollBack() throws Exception {
        commodityService.transactionaRollBack();
    }


    /**
     * 测试默认事务
     * @throws Exception
     */
    @Test
    public void testPropagationRequired() throws Exception {
        commodityService.propagationRequired();
    }


    @Test
    public void save() throws ServiceException {
        Commodity commodity = new Commodity();
        commodity.setName("iPhone 8");
        commodity.setStockLimit(1);
        commodity.setGmtCreate(new Date());
        int count = commodityService.save(commodity);
        Assert.assertTrue(count > 0);
    }

    @Test
    public void testGetById() throws ServiceException {
        Commodity commodity = commodityService.getById(1);
        logger.info(commodity.toString());
    }


    /**
     * 测试同类中的不同方法调用出现异常回滚情况
     * 结果：全部回滚
     * @throws Exception
     */
    @Test
    public void testAdd() throws Exception {

        System.out.println(AopUtils.isAopProxy(commodityService));
        System.out.println(AopUtils.isCglibProxy(commodityService));
        System.out.println(AopUtils.isJdkDynamicProxy(commodityService));
        commodityService.addStock();
    }

}

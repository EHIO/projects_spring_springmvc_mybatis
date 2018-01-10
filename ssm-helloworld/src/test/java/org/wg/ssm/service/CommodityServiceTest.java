package org.wg.ssm.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @Test
    public void testAdd() throws ServiceException {
        commodityService.addStock();
    }

    @Test
    public void testSubtract() throws ServiceException {
        commodityService.subStock();
    }

    @Test
    public void testAdd2() throws ServiceException {
        commodityService.addStock2();
    }

    @Test
    public void testSubtract2() throws ServiceException {
        commodityService.subStock2();
    }
}

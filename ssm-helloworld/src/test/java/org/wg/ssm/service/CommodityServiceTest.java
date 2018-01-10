package org.wg.ssm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.wg.ssm.exception.ServiceException;
import org.wg.ssm.po.Commodity;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@TestExecutionListeners({})
public class CommodityServiceTest {

    @Resource
    private CommodityService commodityService;

    @Test
    public void testGetById() throws ServiceException {
        Commodity commodity = commodityService.getById(1);
        System.out.println(commodity);
    }

}

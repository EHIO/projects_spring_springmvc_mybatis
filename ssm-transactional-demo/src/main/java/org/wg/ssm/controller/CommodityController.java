package org.wg.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wg.ssm.po.Commodity;
import org.wg.ssm.service.CommodityService;

import javax.annotation.Resource;


@Controller
@RequestMapping("/commodity")
public class CommodityController {

    @Resource
    private CommodityService commodityService;


    @RequestMapping("/get")
    @ResponseBody
    public Commodity get(Integer id) {
        Commodity commodity = commodityService.getById(id);
        return commodity;
    }

}

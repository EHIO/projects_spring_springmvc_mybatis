package org.wg.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wg.ssm.po.ItemsCustom;

/**
 * <p>Title: JsonTest</p>
 * <p>Description: json交互测试</p>
 */
@Controller
public class JsonTest {

    //请求json串(商品信息)，输出json(商品信息)
    //@RequestBody将请求的商品信息的json串转成itemsCustom对象
    //@ResponseBody将itemsCustom转成json输出
    @RequestMapping("/requestJson")
    @ResponseBody
    public ItemsCustom requestJson(@RequestBody ItemsCustom itemsCustom) {
        System.err.println(itemsCustom);
        //@ResponseBody将itemsCustom转成json输出
        return itemsCustom;
    }

    //请求key/value，输出json
    @RequestMapping("/responseJson")
    @ResponseBody
    public ItemsCustom responseJson(ItemsCustom itemsCustom) {

        //@ResponseBody将itemsCustom转成json输出
        return itemsCustom;
    }

}

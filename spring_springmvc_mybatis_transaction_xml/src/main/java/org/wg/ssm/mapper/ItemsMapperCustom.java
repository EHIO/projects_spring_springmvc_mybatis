package org.wg.ssm.mapper;

import org.wg.ssm.po.ItemsCustom;
import org.wg.ssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsMapperCustom {
    //商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
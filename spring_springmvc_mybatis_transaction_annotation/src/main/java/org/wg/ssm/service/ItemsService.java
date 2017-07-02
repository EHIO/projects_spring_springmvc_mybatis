package org.wg.ssm.service;

import java.util.List;

import org.wg.ssm.po.ItemsCustom;
import org.wg.ssm.po.ItemsQueryVo;

/**
 * @version 1.0
 * @author wg
 * @date 2015-4-13下午3:48:09
 */
public interface ItemsService {

    //商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

    /**
     * 根据id查询商品信息
     *
     * @param id 查询商品的id
     * @return
     * @throws Exception
     */
    public ItemsCustom findItemsById(Integer id) throws Exception;

    /**
     * 修改商品信息
     *
     * @param itemsCustom 修改的商品信息
     * @throws Exception
     * @author wg
     * @date 2016-5-23上午1:58:02
     */
    public void updateItems(ItemsCustom itemsCustom) throws Exception;

    /**
     * 批量更新商品信息
     *
     * @param itemsCustom
     * @throws Exception
     * @author wg
     * @date 2016-5-23上午2:10:10
     */
    public void batchUpdateItems(ItemsQueryVo itemsQueryVo) throws Exception;
}

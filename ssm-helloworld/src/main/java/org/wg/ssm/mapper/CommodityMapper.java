package org.wg.ssm.mapper;

import org.apache.ibatis.annotations.Param;

public interface CommodityMapper extends CrudMapper {


    int updateStock(@Param("value") int value, @Param("id") int id);

}
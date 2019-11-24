package com.haonan.o2o.dao;

import com.haonan.o2o.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopDao {

    /**
     * 分页查询店铺
     * @Param 店铺名(模糊), 店铺状态, 店铺类别, 区域Id, owner
     * @Param rowIndex 从第几行开始取数据
     * @Param pageSize 返回的行数
     * @return
     */
    List<Shop> queryShopList(@Param("shopCondition")Shop shopCondition,
                             @Param("rowIndex") int rowIndex, @Param("pageSize")int pageSize);

    /**
     * 返回queryShopList总数
     * @param shopCondition
     * @return
     */
    int queryShopCount(@Param("shopCondition")Shop shopCondition);

    /**
     * 通过shop_id查询店铺信息
     */
    Shop queryByShopId(Long shopId);

    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    /**
     * 更新店铺信息
     * @return
     */
    int updateShop(Shop shop);
}

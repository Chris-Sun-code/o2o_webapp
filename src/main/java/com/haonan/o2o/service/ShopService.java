package com.haonan.o2o.service;

import com.haonan.o2o.dto.ShopExecution;
import com.haonan.o2o.entity.Shop;
import com.haonan.o2o.exceptions.ShopOperationException;

import java.io.InputStream;

public interface ShopService {


    /**
     * 根据shopCondition分页返回相应店铺列表
     *
     * @param shopCondition
     * @param pageIndex
     * @param pageSize
     * @return
     */
    ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);


    /**
     * 通过店铺Id获取店铺信息
     *
     * @param shopId
     * @return
     */
    Shop getByShopId(long shopId);

    /**
     * 更新店铺信息，包括对图片的处理
     *
     * @param shop
     * @param fileName
     * @return
     * @throws ShopOperationException
     */
    ShopExecution updateShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;

    /**
     * 添加商铺信息
     * @return
     * @throws ShopOperationException
     */

    ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;

}

package com.haonan.o2o.service.impl;

import com.haonan.o2o.dao.ShopCategoryDao;
import com.haonan.o2o.entity.ShopCategory;
import com.haonan.o2o.service.ShopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Chris
 * @date:2019/11/9
 * @description
 */
@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {

    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Override
    public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {
        return shopCategoryDao .queryShopCategory(shopCategoryCondition);
    }
}

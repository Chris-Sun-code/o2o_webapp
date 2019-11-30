package com.haonan.o2o.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author:Chris
 * @date:2019/11/8
 * @description
 * 解析路由并转发到相应的HTML中
 *
 */
@Controller
@RequestMapping(value = "/shopAdmin", method = RequestMethod.GET )
public class ShopAdminController {

    @RequestMapping(value = "/shopOperation")
    public String shopOperation() {
        return "shop/shopOperation";
    }

    @RequestMapping(value = "/shopList")
    public String shopList() {
        return "shop/shopList";
    }

    @RequestMapping(value = "/shopManagement")
    public String shopManagement() {
        return "shop/shopManagement";
    }

    @RequestMapping(value = "/productCategoryManagement", method = RequestMethod.GET)
    public String productCategoryManage() {
        // 转发至商品类别管理页面
        return "shop/productCategoryManagement";
    }

    @RequestMapping(value = "/productOperation")
    public String productOperation() {
        // 转发至商品添加/编辑页面
        return "shop/productOperation";
    }

    @RequestMapping(value = "/productManagement")
    public String productManagement() {
        return "shop/productManagement";
    }
}

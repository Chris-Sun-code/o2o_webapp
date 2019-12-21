package com.haonan.o2o.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/frontend")
public class FrontendController {

	/**
	 * 首页路由
	 * 
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	private String index() {
		return "frontend/index";
	}

	/**
	 * 商品列表页路由
	 * 
	 * @return
	 */
	@RequestMapping(value = "/shopList", method = RequestMethod.GET)
	private String showShopList() {
		return "frontend/shopList";
	}

	/**
	 * 店铺详情页路由
	 * 
	 * @return
	 */
	@RequestMapping(value = "/shopDetail", method = RequestMethod.GET)
	private String showShopDetail() {
		return "frontend/shopDetail";
	}

	/**
	 * 商品详情页路由
	 * 
	 * @return
	 */
	@RequestMapping(value = "/productDetail", method = RequestMethod.GET)
	private String showProductDetail() {
		return "frontend/productDetail";
	}
}

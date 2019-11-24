package com.haonan.o2o.service;

import com.haonan.o2o.dto.ProductCategoryExecution;
import com.haonan.o2o.entity.ProductCategory;
import com.haonan.o2o.exceptions.ProductCategoryOperationException;

import java.util.List;

public interface ProductCategoryService {
	/**
	 * 查询指定某个店铺下的所有商品类别信息
	 * 
	 * @param shopId
	 * @return List<ProductCategory>
	 */
	List<ProductCategory> getProductCategoryList(long shopId);
	/**
	 *
	 * @param productCategoryList
	 * @return
	 * @throws ProductCategoryOperationException
	 */
	ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
			throws ProductCategoryOperationException;
	/**
	 * 将此类别下的商品里的类别id置为空，再删除掉该商品类别
	 * @param productCategoryId
	 * @param shopId
	 * @return
	 * @throws RuntimeException
	 */
	ProductCategoryExecution deleteProductCategory(long productCategoryId, long shopId)
			throws ProductCategoryOperationException;
}

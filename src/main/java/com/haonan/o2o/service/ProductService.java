package com.haonan.o2o.service;

import com.haonan.o2o.dto.ImageHolder;
import com.haonan.o2o.dto.ProductExecution;
import com.haonan.o2o.entity.Product;
import com.haonan.o2o.exceptions.ProductOperationException;

import java.util.List;

public interface ProductService {

    /**
     * 添加商品信息以及图片处理
     *
     * @return
     * @throws ProductOperationException
     */

    ProductExecution addProduct(Product product, ImageHolder thumbnail, List<ImageHolder> productImgList) throws ProductOperationException;

    /**
     * 通过商品Id查询商品信息
     *
     * @param productId
     * @return
     */
    Product getProductById(long productId);

    /**
     * 分页查询商品列表
     *
     * @param productCondition
     * @param pageIndex
     * @param pageSize
     * @return
     */
    ProductExecution getProductList(Product productCondition, int pageIndex, int pageSize);

    /**
     * 修改商品信息以及图片处理
     *
     * @param product
     * @param thumbnail
     * @param productImgHolderList
     * @return
     * @throws ProductOperationException
     */
    ProductExecution updateProduct(Product product, ImageHolder thumbnail, List<ImageHolder> productImgHolderList) throws ProductOperationException;
}

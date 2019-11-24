package com.haonan.o2o.util;

/**
 * @author:Chris
 * @date:2019/11/4
 * @description
 */
public class PathUtil {

    private static String seperator = System.getProperty("file.separator");
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if(os.toLowerCase().startsWith("win")){
            basePath = "E:/projectdev/image";
        }else {
            basePath="/home/xiangze/image";
        }
        basePath = basePath.replace("/",seperator);
        return basePath;
    }
    public static String getShopImagePath(long shopId){
        String imagePath = "/upload/item/shop/" + shopId +"/";
        return imagePath.replace("/",seperator);
    }
}

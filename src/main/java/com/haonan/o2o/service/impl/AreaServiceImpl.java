package com.haonan.o2o.service.impl;

import com.haonan.o2o.dao.AreaDao;
import com.haonan.o2o.entity.Area;
import com.haonan.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Chris
 * @date:2019/10/28
 * @description
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}

package dao.impl;

import config.FareType;
import dao.FareDao;
import entity.Fare;

/**
 * @author Hung Hoang
 * @version 1.0 Nov 30, 2019
 * @project_name AFCSystemV2
 * @teacher_name Thi Thu Trang Nguyen
 * @class_name ACardDao.java
 * @description TODO
 */
public abstract class ACardDao implements FareDao {

    @Override
    public FareType getType(String code) {
        return null;
    }

    @Override
    public abstract Fare getFareByCode(String code);
}

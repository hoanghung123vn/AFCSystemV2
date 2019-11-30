package dao;

import config.FareType;
import entity.Fare;

/**
 * @author Hung Hoang
 * @version 1.0 Nov 30, 2019
 * @project_name AFCSystemV2
 * @teacher_name Thi Thu Trang Nguyen
 * @class_name FareDao.java
 * @description TODO
 */
public interface FareDao {
    public FareType getType(String code);
    public Fare getFareByCode(String code);
}

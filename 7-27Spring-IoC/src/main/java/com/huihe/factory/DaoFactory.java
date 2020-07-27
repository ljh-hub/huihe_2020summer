package com.huihe.factory;

import com.huihe.dao.Dao;
import com.huihe.dao.impl.OracleDao;

public class DaoFactory {
    private static Dao dao = new OracleDao();
    public Dao getInstance(){
        return dao;
    }
}

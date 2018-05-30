package com.service.impl;

import com.dao.BaseDao;
import com.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by forenms-12 on 2018/5/30.
 */
public class BaseServiceImpl<T extends Serializable,M extends BaseDao<T,E>, E extends Serializable> implements BaseService<T, E> {

    @Autowired
    M baseDao ;

    @Override
    public E add(T t) {
        return baseDao.add(t);
    }

    @Override
    public E delete(E e) {
        return baseDao.delete(e);
    }

    @Override
    public E update(T t) {
        return baseDao.update(t);
    }

    @Override
    public T get(T t) {
        return baseDao.get(t);
    }

    @Override
    public List<T> getList(T t) {
        return baseDao.getList(t);
    }
}

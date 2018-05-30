package com.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by forenms-12 on 2018/5/30.
 */
public interface BaseDao<T extends Serializable, E extends Serializable> {

    public E add(T t);

    public E delete(E e);

    public E update(T t);

    public T get(T t);

    public List<T> getList(T t);

}

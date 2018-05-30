package com.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by forenms-12 on 2018/5/30.
 */
public interface BaseService<T extends Serializable, E extends Serializable> {

    E add(T t);

    E delete(E e);

    E update(T t);

    T get(T t);

    List<T> getList(T t);

}

package com.company.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T, ID> {

    public Map<ID, T> map = new HashMap<>(); // DB

    T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    List<T> findAll() {
        return new ArrayList<>(map.values());
    }

    T findByID(ID id) {
        return map.get(id);
    }

    void deleteByID(ID id) {
        map.remove(id);
    }

}

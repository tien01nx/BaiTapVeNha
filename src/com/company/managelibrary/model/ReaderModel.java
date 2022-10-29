package com.company.managelibrary.model;


import com.company.managelibrary.view.IService;

import java.util.List;

public class ReaderModel implements IService<Reader, List<Reader>> {
    @Override
    public void insert(Reader obj, List<Reader> objs) {
        objs.add(obj);
    }

    @Override
    public void delete(Reader obj, List<Reader> objs) {
        objs.remove(obj);
    }

    @Override
    public void update(int key, Reader obj, List<Reader> objs) {
        objs.set(key,obj);
    }
}

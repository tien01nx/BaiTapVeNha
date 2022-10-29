package com.company.managelibrary.model;



import com.company.managelibrary.view.IService;

import java.util.List;

public class BookModel implements IService<Book, List<Book>> {

    @Override
    public void insert(Book obj, List<Book> objs) {
        objs.add(obj);
    }

    @Override
    public void delete(Book obj, List<Book> objs) {
        objs.remove(obj);
    }

    @Override
    public void update(int key,Book obj, List<Book> objs) {
        objs.set(key,obj);
    }

}

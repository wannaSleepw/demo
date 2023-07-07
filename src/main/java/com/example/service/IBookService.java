package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;
import org.springframework.stereotype.Repository;


public interface IBookService extends IService<Book> {
    public IPage<Book> getPage(int currentPage, int pageSize);
}

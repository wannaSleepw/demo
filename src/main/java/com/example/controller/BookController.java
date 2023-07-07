package com.example.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.utills.R;
import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true,bookService.list());
    }

    @GetMapping("{id}")
    public R get(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

    @PostMapping
    public R save(@RequestBody Book book){
        return new R( bookService.save(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R selectPage(@PathVariable int currentPage, @PathVariable int pageSize){
        IPage<Book> page = bookService.getPage(currentPage, pageSize);
        if (currentPage > page.getPages()){
            page = bookService.getPage((int)page.getPages(), pageSize);
        }

        return new R(true,page);
    }


}

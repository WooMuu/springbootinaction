package com.zjb.chapter2.controller;

import com.zjb.chapter2.entity.Book;
import com.zjb.chapter2.repositery.ReadingListRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zjb on 2019/11/18.
 */
@RestController
@RequestMapping("/readingList")
public class ReadingListController {
    private ReadingListRepositery repositery;

    @Autowired
    public ReadingListController(ReadingListRepositery repositery) {
        this.repositery = repositery;
    }

    @GetMapping(value = "/readersBooks")
    public List<Book> readersBooks(String reader) {
        List<Book> readinglist = repositery.findByReader(reader);
        return readinglist;
    }

    @PostMapping(value = "/addToReadingList")
    public Book addToReadingList(String reader, Book book) {
        book.setReader(reader);
        Book book1 = repositery.save(book);
        return book1;
    }
}

package com.zjb.chapter2.controller;

import com.zjb.chapter2.entity.Book;
import com.zjb.chapter2.repositery.ReadingListRepositery;
import com.zjb.chapter3.Properties.AmazonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zjb on 2019/11/18.
 */
@RestController
@RequestMapping("/readingList")
public class ReadingListController {
    private ReadingListRepositery repositery;

    @Autowired
    private AmazonProperties properties;

    @Autowired
    public ReadingListController(ReadingListRepositery repositery) {
        this.repositery = repositery;
    }

    @GetMapping(value = "/readersBooks")
    public List<Book> readersBooks(String reader) {
        List<Book> readinglist = repositery.findByReader(reader);
        for (Book book : readinglist) {
            book.setAssociateId(properties.getAssociateId());
        }
        return readinglist;
    }

    @PostMapping(value = "/addToReadingList")
    public Book addToReadingList(String reader, Book book) {
        book.setReader(reader);
        Book book1 = repositery.save(book);
        return book1;
    }
}

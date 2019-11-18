package com.zjb.repositery;

import com.zjb.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zjb on 2019/11/18.
 */
public interface ReadingListRepositery extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}

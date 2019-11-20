package com.zjb.chapter2.repositery;

import com.zjb.chapter2.conditions.JdbcTemplateCondition;
import com.zjb.chapter2.entity.Book;
import org.springframework.context.annotation.Conditional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zjb on 2019/11/18.
 */
@Conditional(JdbcTemplateCondition.class)//只有符合JdbcTemplateCondition.class定义的条件才初始化此类
public interface ReadingListRepositery extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}

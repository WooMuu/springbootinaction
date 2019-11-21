package com.zjb;

import com.zjb.chapter2.entity.Book;
import com.zjb.chapter2.repositery.ReadingListRepositery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by zjb on 2019/11/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadersBooksTest {

    @Autowired
    private ReadingListRepositery repositery;

    @Test
    public void testService() {
        List<Book> me = repositery.findByReader("me");
        assert me.get(0).getReader().equals("me");
    }


}

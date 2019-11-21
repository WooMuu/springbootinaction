package com.zjb;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by zjb on 2019/11/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class MockMvcWebTests {
    @Autowired
    private WebApplicationContext WebContext;

    private MockMvc mockMvc;

    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(WebContext).build();
    }

    @Test
    public void getBook() throws Exception {
        mockMvc.perform(get("/readingList/readersBooks"))
                .andExpect(status().isOk());
    }

    @Test
    public void addBook() throws Exception {
        mockMvc.perform(post("/readingList/addToReadingList")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("title", "BOOK TITLE")
                .param("author", "BOOK AUTHOR")
                .param("isbn", "3239234")
                .param("description", "DESCRIPTION"))
        .andExpect(status().is2xxSuccessful());
    }
}

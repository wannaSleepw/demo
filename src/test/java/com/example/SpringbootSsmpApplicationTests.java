package com.example;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.BookDao;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSsmpApplicationTests {

	@Autowired
	private BookDao bookDao;
	@Test
	void contextLoads() {
		System.out.println(bookDao.selectById(1));
	}

	@Test
	void testGetPage()
	{
		IPage page = new Page(1,5);
		bookDao.selectPage(page,null);
	}
}

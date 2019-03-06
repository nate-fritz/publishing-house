package org.wecancodeit.publishinghouse;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.publishinghouse.repositories.BookRepository;

public class BookMvcTest {

	public BookMvcTest() {

	}

	@RunWith(SpringJUnit4ClassRunner.class)
	@DataJpaTest
	public class JpaMappingsTest {
	 
	}
	
	@Resource
	private TestEntityManager entityManager;
	 
	@Resource
	private BookRepository bookRepo;
}

package org.wecancodeit.publishinghouse.repositories;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.publishinghouse.models.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class BookTest {
	
	@Resource
	private TestEntityManager entityManager;
	 
	@Resource
	private BookRepository bookRepo;
	
	@Test
	public void shouldSaveAndLoadBook() {
		Book book = bookRepo.save(new Book("Fire and Blood", "George R. R. Martin", "Fantasy"));
	
	    entityManager.persist(book);
	    entityManager.flush(); 
	    entityManager.clear();
	    
	    Book bookFromDatabase = bookRepo.findByTitle("Head First Java");
	 
	    assertThat(bookFromDatabase.getTitle(), is("Head First Java"));
	}

}

// Assistance creating tests from Dawn and Subin
// referenced tests from https://github.com/SocialFinance/wrl/blob/master/test/services/BookmarkServiceTest.java
package services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import configs.AppConfig;
import configs.TestDataConfig;
import jpa.Task1;
import org.junit.Assert;
//import status.StatusCode;


import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.PersistenceException;



	//save same thing more than once (handle )
	// Save 2 different things and verify you get 2 things back

@ContextConfiguration(classes = { AppConfig.class, TestDataConfig.class })
public class TaskPersistenceServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Inject
	private TaskPersistenceService taskPersist;

	@Test	//happy
	public void emptyListTest() {
		final List<Task1> list = taskPersist.fetchAllTasks();
		assertTrue("List should be empty", list.isEmpty());
	}
	
	@Test
	public void filledListTest() {
		final Task1 t = new Task1();
		t.setContents("contents");
		taskPersist.saveTask(t);
		final List<Task1> list = taskPersist.fetchAllTasks();
		assertTrue("List should be equal to 1", list.size() == 1);
	}

	 /**
     * List a single item
     */
	 @Test
	    public void listSingleTest() {
	        List<Task1> list = taskPersist.fetchAllTasks();
	        Assert.assertNotNull("List is null", list);

	        Assert.assertEquals("The initial size of the list should be 0", 0, list.size());

	        final Task1 t = new Task1();
	       // Assert.assertEquals("List adding failure", StatusCode.ADD_SUCCESS, taskPersist.fetchAllTasks());
	        Assert.assertEquals("List adding failure", taskPersist.addTask());
	        list = taskPersist.fetchAllTasks();

	        Assert.assertEquals("Total list count should be 1", 1, list.size());
	        Assert.assertNotNull("list retrieved is null", list.get(0));
	    }

	 /**
	 * List two guesses on same game using getAllGuesses()
	 */
	 @Test
	    public void listTwoTest() {
	        List<Task1> list = taskPersist.fetchAllTasks();
	        Assert.assertNotNull("List is null", list);

	        Assert.assertEquals("Wrong initial size of the list, should be 0", 0, list.size());

	        final Task1 t = new Task1();
	       // Assert.assertEquals("List 1 adding failure", StatusCode.ADD_SUCCESS, taskPersist.fetchAllTasks());
	        Assert.assertEquals("List 1 adding failure", taskPersist.fetchAllTasks());
	        list = taskPersist.fetchAllTasks();
	        Assert.assertEquals("Total item count should be 1", 1, list.size());

	        final Task1 t2 = new Task1();
	       // Assert.assertEquals("List 2 adding failure", StatusCode.ADD_SUCCESS, taskPersist.fetchAllTasks());
	        Assert.assertEquals("List 2 adding failure", taskPersist.fetchAllTasks());
	        list = taskPersist.fetchAllTasks();
	        Assert.assertEquals("Total item count should be 2", 2, list.size());

	        Assert.assertNotEquals("Items in the list are not unique, but should have been.", list.get(0), list.get(1));
	    }
	 
	 /**
	  * Add same/exact duplicate guess
	  */
	 @Test	
	    public void addExactDuplicateTest() {
		 List<Task1> list = taskPersist.fetchAllTasks();
	        Assert.assertNotNull("List is null", list);
	        Assert.assertEquals("Wrong initial size of the list, should be 0", 0, list.size());

	        final Task1 t = new Task1();
	      //  Assert.assertEquals("list adding failure", StatusCode.ADD_SUCCESS, taskPersist.fetchAllTasks());
	        Assert.assertEquals("list adding failure", taskPersist.fetchAllTasks());
	        list = taskPersist.fetchAllTasks();
	        Assert.assertEquals("Total item count should be 1", 1, list.size());

	        // Add same exact/original/duplicate item
	        Assert.assertEquals("Duplicate item protection fails", taskPersist.fetchAllTasks());
	        Assert.assertEquals("Total item count should still be 1 after adding duplicate item", 1, taskPersist.fetchAllTasks());
	        Assert.assertEquals("Retrieved item is not the same as original", list, list.get(0));
	    }

	 
	@Test
	public void saveValidTaskTest() {
		assertTrue("List should be empty", taskPersist.fetchAllTasks().isEmpty());

		final Task1 t = new Task1();
		t.setContents("contents");
		assertNull("ID should not be set before persist is called", t.getId());
		taskPersist.saveTask(t);
		assertNotNull("ID should be set after persist is called", t.getId());
		final List<Task1> list = taskPersist.fetchAllTasks();
		assertTrue("List should have one element", list.size() == 1);
	}

	@Test	//crappy
	public void saveBlankTaskTest() {
		try {
			final Task1 t = new Task1();
			taskPersist.saveTask(t);
			fail("This should have failed since contents is blank");
		} catch (IllegalArgumentException ignored) {
		}
	}

	@Test	//crappy
	public void saveNonBlankIdTaskTest() {
		try {
			final Task1 t = new Task1();
			t.setContents("contents");
			t.setId(1L);
			taskPersist.saveTask(t);
			fail("This should have failed since id is not blank");
		} catch (PersistenceException ignored) {
		}
	}

	@Test	//crazy
	public void saveNullTaskTest() {
		try {
			taskPersist.saveTask(null);
			fail("This should have failed since null task was sent");
		} catch (IllegalArgumentException ignored) {
		
		}	
	}
}
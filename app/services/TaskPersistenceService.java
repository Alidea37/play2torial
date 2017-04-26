package services;

import jpa.Task1;

import java.util.List;


public interface TaskPersistenceService {
	/**
	 * @param t
	 * Saves tasks in the MySQL database as a t object
	 */
    void saveTask(Task1 t);

    /**
     * @return
     * Fetches all tasks saved in the MySQl Database and places them in a list called Task1
     */
    List<Task1> fetchAllTasks();
}

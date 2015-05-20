package mypackage;

import java.util.Collection;

public interface Process {
	/*
	 * read the detail of book which have the given id
	 * return null if not found
	 */
	Article read(int id);  
	/*
	 * add new record to the collection
	 * return true if success
	 * otherwise false;
	 */
	boolean addNew();
	/*
	 * Id is unique, thus search by id return only one record
	 * return null if not found
	 */
	Article searchById(int id);
	/*
	 * Both search by title and by author return collection of 
	 * book because title and author can have more than one
	 */
	Collection<Article> searchByTitle(String title);
	Collection<Article> searchByAuthor(String author);
	
	boolean updateById(int id);
	boolean updateByTitle(String title);
	boolean updateByAuthor(String author);
	
	boolean deleteById(int id);
	boolean deleteByTitle(String title);
	boolean deleteByAuthor(String author);
	
	
}

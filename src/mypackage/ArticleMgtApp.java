package mypackage;

import java.util.*;
public class ArticleMgtApp extends AppFrame implements Process {
	private Collection<Book> list;
	private Book book;
	
	public ArticleMgtApp() {
		// TODO Auto-generated constructor stub
	}
	public int getCommand(String str){
		System.out.print(str);
		try{
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			return scanner.nextInt();
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	@Override
	public Book read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNew() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Book> searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Book> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByAuthor(String author) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByAuthor(String author) {
		// TODO Auto-generated method stub
		return false;
	}

}

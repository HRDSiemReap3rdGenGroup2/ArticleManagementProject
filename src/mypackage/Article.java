package mypackage;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/*
 * This class is created for managing data of Article;
 * 
 */
public class Article {
	private int id;
	private String title;
	private String author;
	private String date;
	private String content;
	/*
	 * The constructor contain one Collection parameter
	 * We will get the id of the last element of this collection and use it
	 * as the id of the new object
	 */
	public Article(Collection<Article> c, String title, String author, String content) {
		super();
		setId(c);
		this.title = title;
		this.author = author;
		setDate();
		this.content = content;
	}
	/*
	 * Private the method setId 
	 * so the id cannot be set or modify manually
	 * 
	 */
	private void setId(Collection<Article> c){
		if(c.size()!=0){
			Object[] obj=c.toArray();
			Article temp=(Article)obj[obj.length-1]; //Casting the last element of array object and pass it to a temporary Book object
			this.id=temp.id+1;
		}else{
			this.id=1;
		}
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	private void setDate() {
		this.date=new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}

package mypackage;

import java.util.*;

public class MyTest {
	Collection<Article> list = new ArrayList<Article>();
	Article article;
	MyTest(){
		//add new
		for(int i=0;i<10;i++){
			article=new Article(list, "my_title", "my_author", "my_content");
			list.add(article);
			article=null;
		}
		System.out.println("Add success!");
//		//remove id = 5
//		int id=11;boolean found=false;
//		Iterator<Article> it=list.iterator();
//		while(it.hasNext()){
//			Article temp=(Article)it.next();
//			if(temp.getId()==id){
//				it.remove();
//				found=true;
//				break;
//			}
//		}
//		if(found!=true)
//			System.out.println("Not found!");
//		else
//			System.out.println("Remove success!");
		//remove author
		String author="my_author";
		boolean found1=false;
		Iterator<Article> it1=list.iterator();
		while(it1.hasNext()){
			Article temp=(Article)it1.next();
			if(temp.getAuthor()==author){
				it1.remove();
				found1=true;
			}
		}
		if(found1!=true)
			System.out.println("Not found!");
		else
			System.out.println("Remove success!");
		
		
		//display
		Object[] obj=list.toArray();
		for(int i=0;i<obj.length;i++){
			Article temp=(Article)obj[i];
			display(temp);
		}
	}
	public void display(Article a){
		System.out.println("Id:" + a.getId()+", "+"Title:"+a.getTitle()+", Author:"+a.getAuthor()+", Date:"+a.getDate());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTest();
	}

}

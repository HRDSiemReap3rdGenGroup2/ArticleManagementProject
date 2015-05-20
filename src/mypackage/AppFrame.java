package mypackage;
import java.util.*;
public class AppFrame {
	public static final int DEFAULT_NUMBER_OF_ROW_TO_DISPLAY=5;
	private int numberOfRowToDiplay;
	private int numPage;
	
	public void displayTable(Collection<Article> c, int row){
		setNumberOfPage(c.size(),row);
	}
	
	private void setNumberOfPage(int c,int row){
		if(numberOfRowToDiplay<=0)numberOfRowToDiplay=DEFAULT_NUMBER_OF_ROW_TO_DISPLAY;
		else numberOfRowToDiplay=row;
		numPage=c/row;//?????????????????
	}
	
	public int getNumberOfRowToDiplay() {
		return numberOfRowToDiplay;
	}
	public void setNumberOfRowToDiplay(int numberOfRowToDiplay) {
		this.numberOfRowToDiplay = numberOfRowToDiplay;
	}

	
	
	
}

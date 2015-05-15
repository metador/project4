package project4;

import java.awt.List;
import java.util.ArrayList;



public class DBLP {

	private String title;

	private int start_page;
	
	private int end_page;
	private int year;
	private int volume;
	private int number;
	private String url="";
	private String ee="";
	private String cdrom="";
	private String cite="";
	private String crossref="";
	private String isbn="";
	private String series="";
	private String editor="";
	private ArrayList<String> authors=new ArrayList<String>();
	private String booktitle="";
	private String genre="";
	private String publisher="";
	public DBLP(){
		
	}
	
	
	public int getStart_page() {
		return start_page;
	}

	public void setStart_page(int start_page) {
		this.start_page = start_page;
	}

	public int getEnd_page() {
		return end_page;
	}

	public void setEnd_page(int end_page) {
		this.end_page = end_page;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return year;
	}

	public void setType(int year) {
		this.year = year;
	}	
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Employee Details - ");
		sb.append("title:" + getTitle());
		sb.append(", ");
		sb.append("Type:"  );
		sb.append(", ");
		sb.append("end_page:" + getEnd_page());
		sb.append(", ");
		sb.append("start_page:" + getStart_page());
		sb.append(".");
		
		return sb.toString();
	}
}

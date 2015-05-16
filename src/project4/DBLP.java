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
	  String publisher="";
	public DBLP(){
		
	}
	
public DBLP(
		  String title,
		  int start_page,
		  int end_page,
		  int year,
		  int volume,
		  int number,
		  String url ,
		  String ee ,
		  String cdrom ,
		  String cite ,
		  String crossref ,
		  String isbn ,
		  String series ,
		  String editor ,
		  ArrayList<String> authors,
		  String booktitle ,
		  String genre 
		){
	  this. title=title;
	  this. start_page=start_page;
	  this. end_page=end_page;
	  this. year=year;
	  this. volume=volume;
	  this. number=number;
	  this. url =url;
	  this. ee =ee;
	  this. cdrom =cdrom;
	  this. cite =cite;
	  this. crossref =crossref;
	  this. isbn =isbn;
	  this. series =series;
	  this. editor =editor;
	  this.authors=authors;
	  this. booktitle =booktitle;
	  this. genre =genre;
		
	}
	
	public String getTitle() {
	return title;
	}

	public void setTitle(String title) {
	this.title = title;
	}
	public int getStart_page() {
		return start_page ;
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

	


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}	
	public int getVoulume() {
		return volume;
	}

	public void setVoulme(int volume) {
		this.volume = year;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getEe() {
		return ee;
	}

	public void setEe(String Ee) {
		this.ee = Ee;
	}
	
	public String getCdrom() {
		return cdrom;
	}

	public void setCdrom(String Cdrom) {
		this.cdrom = Cdrom;
	}
	
	public String getCite() {
		return cite;
	}

	public void setCite(String Cite) {
		this.cite = Cite;
	}
	
	public String getCrossref() {
		return crossref;
	}

	public void setCrossref(String Crossref) {
		this.crossref = Crossref;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String Isbn) {
		this.isbn = Isbn;
	}
	
	public String getSeries() {
		return series;
	}

	public void setSeries(String Series) {
		this.series = Series;
	}
	
	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String Booktitle) {
		this.booktitle = Booktitle;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String Publisher) {
		this.publisher = Publisher;
	}
	 
	
	public ArrayList<String> getAuthor() {
		return authors;
	}

	public void setPublisher(ArrayList<String>  authors) {
		this.authors = authors;
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

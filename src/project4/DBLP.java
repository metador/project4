package project4;

import java.awt.List;
import java.util.ArrayList;



public class DBLP {

	private String title;

	private Integer start_page;
	
	private Integer end_page;
	private Integer year;
	private Integer volume;
	private Integer number;
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
	
public DBLP(
		  String title,
		  Integer start_page,
		  Integer end_page,
		  Integer year,
		  Integer volume,
		  Integer number,
		  String url ,
		  String ee ,
		  String cdrom ,
		  String cite ,
		  String crossref ,
		  String isbn ,
		  String series ,
		  String editor ,
		//  ArrayList<String> authors,
		  String booktitle ,
		  String genre,
		  String publisher
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
	  this. publisher =publisher;
	}
	

	public void setStart_page(Integer start_page) {
		this.start_page = start_page;
	}
	
	public int getStart_page() {
		return start_page;
	}

	public Integer getEnd_page() {
		return end_page;
	}

	public void setEnd_page(Integer end_page) {
		this.end_page = end_page;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}	

	public void setVolume(Integer volume) {
		this.volume = year;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}	
	
	public void setType(int year) {
		this.year = year;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
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

	public void setEe(String ee) {
		this.ee = ee;
	}
	


	public String getCdrom() {
		return cdrom;
	}

	public void setCdrom(String cdrom) {
		this.cdrom = cdrom;
	}
	


	public String getCite() {
		return cite;
	}

	public void setCite(String cite) {
		this.cite = cite;
	}
	


	public String getCrossref() {
		return crossref;
	}

	public void setCrossref(String crossref) {
		this.crossref = crossref;
	}
	


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	


	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
	
	public String getEditor() {
		return editor;
	}


	public void setEditor(String editor) {
		this.editor = editor;
	}
	


	public ArrayList<String> getAuthors() {
		return authors;
	}


	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}


	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
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
	 

	public void setPublisher(ArrayList<String>  authors) {
		this.authors = authors;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	 	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Employee Details - ");
		sb.append("title:" + getTitle());
		sb.append(", ");
		sb.append("end_page:" + getEnd_page());
		sb.append(", ");
		sb.append("start_page:" + getStart_page());
		sb.append(",");
		sb.append("Year" + getYear());
		sb.append(", ");
		sb.append(",");
		sb.append("Voulme" + getVolume()+"Number"+getNumber() +" "+getBooktitle()+" "+getCdrom()+" "+getIsbn());

		
		return sb.toString();
	}
}

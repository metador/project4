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


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
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


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}

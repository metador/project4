package project4;

import java.util.ArrayList;
import java.util.HashMap;
import java.sql.*;

public class Insertion 
{
	private static ArrayList<DBLP> books = new ArrayList<DBLP> ();
	private DBLP book = new DBLP();
	public static Connection connection;
	public PreparedStatement idSearch, loadTable;
	public String idQuery;
	public ResultSet idResult;
	public int ID = -1;
	private HashMap<String,Integer> genre = new HashMap<String,Integer>();
	private HashMap<String,Integer> people = new HashMap<String,Integer>();
	private HashMap<String,Integer> title = new HashMap<String,Integer>();
	private HashMap<String,Integer> publisher = new HashMap<String,Integer>();
	
	public Insertion(ArrayList<DBLP> bks, Connection connect)
	{
		books = bks;
		connection = connect;
	}
	
	public int searchID (String name, String type) throws SQLException
	{
		switch(type)
		{
			case "genre" :
				if(genre.containsKey(name))
					ID = genre.get(name);
				else
				{
					idQuery = "insert into tbl_genres set genre_name = '" + name + "';";
					idSearch = (PreparedStatement) connection.prepareStatement(idQuery);
					ID = idSearch.executeUpdate(idQuery, Statement.RETURN_GENERATED_KEYS);
					genre.put(name, ID);
				}
				break;
			case "people" :
				if(people.containsKey(name))
					ID = people.get(name);
				else
				{
					idQuery = "insert into tbl_people set name = '" + name + "';";
					idSearch = (PreparedStatement) connection.prepareStatement(idQuery);
					ID = idSearch.executeUpdate(idQuery, Statement.RETURN_GENERATED_KEYS);
					people.put(name, ID);
				}
				break;
			case "title" :
				if(title.containsKey(name))
					ID = title.get(name);
				else
				{
					idQuery = "insert into tbl_booktitle set title = '" + name + "';";
					idSearch = (PreparedStatement) connection.prepareStatement(idQuery);
					ID = idSearch.executeUpdate(idQuery, Statement.RETURN_GENERATED_KEYS);
					title.put(name, ID);
				}
				break;
			case "publisher" :
				if(publisher.containsKey(name))
					ID = publisher.get(name);
				else
				{
					idQuery = "insert into tbl_publisher set publisher_name = '" + name + "';";
					idSearch = (PreparedStatement) connection.prepareStatement(idQuery);
					ID = idSearch.executeUpdate(idQuery, Statement.RETURN_GENERATED_KEYS);
					publisher.put(name, ID);
				}
				break;
			default :
				System.out.println("Error in type. Please check!");
		}
		return ID;
	}
	
	public void insert() throws SQLException 
	{
		int iter1 = 0, iter2 = 0;
		String insertHeadDoc = "insert into tbl_dblp_document ('title', 'start_page', 'end_page', 'year', "
				+ "'volume', 'number' , 'url', 'ee', 'cdrom', 'cite', 'crossref', 'isbn', 'series',"
				+ " 'editor_id', 'booktitle_id', 'genre_id', 'publisher_id') values ";
		String insertHeadAuthor = "insert into tbl_author_document_mapping ('doc_id', 'author_id') values ";
		String query;
		while (iter1 != books.size())
		{
			book = books.get(iter1);
			query = insertHeadDoc + " (";
			query += "'" + book.getTitle() + "', '" + book.getStart_page() + "', '" + book.getEnd_page() + "',";
			query += " '" + book.getYear() + "', '" + book.getVolume() + "', '" + book.getNumber() + "',";
			query += " '" + book.getUrl() + "', '" + book.getEe() + "', '" + book.getCdrom() + "',";
			query += " '" + book.getCite() + "', '" + book.getCrossref() + "', '" + book.getIsbn() + "',";
			query += " '" + book.getSeries() + "', '" + searchID(book.getEditor(),"people") + "', '" + searchID(book.getBooktitle(),"title") + "',";
			query += " '" + searchID(book.getGenre(),"genre") + "', '" + searchID(book.getPublisher(),"publisher") + "');";
			
			loadTable = (PreparedStatement) connection.prepareStatement(query);
			ID = loadTable.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
			iter1++;
			
			iter2 = 0;
			while(iter2 != book.getAuthors().size())
			{
				query = insertHeadAuthor;
				query += "('" + ID + "', '" + searchID(book.getAuthors().get(iter2),"people") + "');";
				loadTable = (PreparedStatement) connection.prepareStatement(query);
				loadTable.executeUpdate();
				iter2++;
			}
		}
	}
}

package project4;

import java.util.ArrayList;
import java.util.HashMap;
import java.sql.*;

public class Insertion 
{
	private static ArrayList<DBLP> books = new ArrayList<DBLP> ();
	private static DBLP book = new DBLP();
	public static Connection connection;
	public static PreparedStatement idSearch;
	public static String idQuery;
	public static ResultSet idResult;
	public int ID = -1;
	private HashMap<String,Integer> genre = new HashMap<String,Integer>();
	private HashMap<String,Integer> people = new HashMap<String,Integer>();
	private HashMap<String,Integer> title = new HashMap<String,Integer>();
	private HashMap<String,Integer> publisher = new HashMap<String,Integer>();
	
	public static void Insertion(ArrayList<DBLP> bks, Connection connect)
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
					idSearch.executeUpdate();
					idQuery = "select id from tbl_genres where genre_name = '" + name + "';";
					idSearch = (PreparedStatement) connection.prepareStatement(idQuery);
					idResult = idSearch.executeQuery();
					idResult.next();
					ID = Integer.parseInt(idResult.getString("id"));
					genre.put(name, ID);
				}
				break;
			case "people" :
				break;
			case "title" :
				break;
			case "publisher" :
				break;
			default :
				System.out.println("Error in type. Please check!");
		}
		return ID;
	}
	
	public void insert() 
	{
		int iter = 0;
		String query = "insert into tbl_dblp_document ('title', 'start_page', 'end_page', 'year', "
				+ "'volume', 'number' , 'url', 'ee', 'cdrom', 'cite', 'crossref', 'isbn', 'series',"
				+ " 'editor_id', 'booktitle_id', 'genre_id', 'publisher_id') values (";
		while (books.isEmpty())
		{
			book = books.remove(iter);
			query += "'" + book.getTitle() + "', '" + book.getStart_page() + "', '" + book.getEnd_page() + "',";
			query += " '" + book.getYear() + "', '" + book.getVolume() + ;
		}
	}
}

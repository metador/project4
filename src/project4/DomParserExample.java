package project4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserExample {

	//No generics
	List myEmpls;
	Document dom;


	public DomParserExample(){
		//create a list to hold the employee objects
		myEmpls = new ArrayList();
	}

	public void runExample() {
		
		//parse the xml file and get the dom object
		parseXmlFile();
		
		//get each employee element and create a Employee object
		parseDocument();
		
		//Iterate through the list and print the data
		printData();
		
	}
	
	
	private void parseXmlFile(){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			
			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			//parse using builder to get DOM representation of the XML file
			dom = db.parse("final-data.xml");
			

		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	
	private void parseDocument(){
		//get the root elememt
		Element docEle = dom.getDocumentElement();
		
		//get a nodelist of <employee> elements
		NodeList nl = docEle.getElementsByTagName("book");
		if(nl != null && nl.getLength() > 0) {
			for(int i = 0 ; i < nl.getLength();i++) {
				
				//get the employee element
				Element el = (Element)nl.item(i);
				
				//get the Employee object
				DBLP e = getDetails(el);
				
				//add it to list
				myEmpls.add(e);
			}
		}
	}


	/**
	 * I take an employee element and read the values in, create
	 * an Employee object and return it
	 * @param empEl
	 * @return
	 */
	private DBLP getDetails(Element empEl) {
		
		//for each <employee> element get text or int values of 
		//name ,id, age and name
		 String title="";

		Integer start_page=0;
		
		Integer end_page=0;
		Integer year;
		Integer volume;
		Integer number;
		 String url="";
		 String ee="";
		 String cdrom="";
		 String cite="";
		 String crossref="";
		 String isbn="";
		 String series="";
		 String editor="";
		 ArrayList<String> authors=new ArrayList<String>();
		 String booktitle="";
		 String genre="";
		  String publisher="";
	     title = getTextValue(empEl,"title");
		year = getIntValue(empEl,"year");
		volume = getIntValue(empEl,"volume");
		number = getIntValue(empEl,"number");
		url = getTextValue(empEl,"url");
		ee = getTextValue(empEl,"ee");
		cdrom = getTextValue(empEl,"cdrom");
		cite = getTextValue(empEl,"cite");
		crossref = getTextValue(empEl,"crossref");
		isbn = getTextValue(empEl,"isbn");
		series = getTextValue(empEl,"series");
		editor = getTextValue(empEl,"editor");
		booktitle = getTextValue(empEl,"booktitle");
		genre="book";
		publisher=getTextValue(empEl,"publisher");;
		//String type = empEl.getAttribute("type");
		
		//Create a new Employee with the value read from the xml nodes
		/*  ++++parameters map for initialsation
		 * String title,
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
		  String genre */
		DBLP e = new DBLP(title,start_page,end_page,year,volume,number,url,ee,cdrom,cite,crossref,isbn,series,editor, booktitle,genre,publisher);
		
		return e;
	}


	/**
	 * I take a xml element and the tag name, look for the tag and get
	 * the text content 
	 * i.e for <employee><name>John</name></employee> xml snippet if
	 * the Element points to employee node and tagName is name I will return John  
	 * @param ele
	 * @param tagName
	 * @return
	 */
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}

	
	/**
	 * Calls getTextValue and returns a int value
	 * @param ele
	 * @param tagName
	 * @return
	 */
	private Integer getIntValue(Element ele, String tagName) {
		//in production application you would catch the exception
	if(getTextValue(ele,tagName)!=null)
		return Integer.parseInt(getTextValue(ele,tagName).replaceAll("[^0-9]",""));
	else
	return null;
	}
	
	/**
	 * Iterate through the list and print the 
	 * content to console
	 */
	private void printData(){
		
		System.out.println("No of books '" + myEmpls.size() + "'.");
		
		Iterator it = myEmpls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	
	public static void main(String[] args){
		//create an instance
		DomParserExample dpe = new DomParserExample();
		
		//call run example
		dpe.runExample();
	}

}

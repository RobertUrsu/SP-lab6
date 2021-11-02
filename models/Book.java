/**
 * 
 */
package lab6.models;
import lab6.services.*;
import java.util.ArrayList;

/**
 * @author Diana Anton
 *
 */
public class Book implements Visitee {
	private String title;
	private ArrayList<Author> authors;
	private ArrayList<Element> content = new ArrayList<>();
	
	/**
	 * 
	 * @param name
	 */
	public Book(String name) {
		this.title = name;
	}
	
	/**
	 * 
	 */
//	public void print() {
//		System.out.println("Book: " + this.title + "\n");
//		System.out.println("Authors: ");
//		for(Author a : authors) {
//			a.print();
//		}
//		
//		System.out.println("\n");
//		
//		for(Element e: content) {
//			e.print();
//		}
//	}
	
	/**
	 * 
	 * @param a
	 */
	public void addAuthor(Author a) {
		if(authors == null) {
			authors = new ArrayList<>();
		}
		authors.add(a);
	}
	
	/**
	 * Adds new content to the array.
	 * @param e - The element to be added to the array.
	 */
	public void addContent(Element e) {
		this.content.add(e);
	}

	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visitBook(this);		
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the authors
	 */
	public ArrayList<Author> getAuthors() {
		return authors;
	}

	/**
	 * @return the content
	 */
	public ArrayList<Element> getContent() {
		return content;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(ArrayList<Element> content) {
		this.content = content;
	}
	
}

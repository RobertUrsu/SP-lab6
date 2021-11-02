package lab6.models;
import lab6.services.*;
/**
 * @author Diana Anton
 *
 */
public class TableOfContents implements Element, Visitee {
	private String name;

	/**
	 * @param name
	 */
	public TableOfContents(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

//	public void print() {
//		System.out.println("mesaj");
//	}
// 
	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
	}

	@Override
	public Element get(int poz) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
		return null;
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze		
	}

	@Override
	public boolean find(Element e) {
		// TODO Auto-generated method stub
		if (!(e instanceof TableOfContents)) {
			return false;
		}
		else {
			return ((TableOfContents) e).name.equals(this.name);
		}
	}

	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visitTableOfContents(this);
	}
}

/**
 * 
 */
package lab6.models;
import lab6.services.*;
/**
 * @author Diana Anton
 *
 */
public class Table implements Element, Visitee {
    private String title;

    public Table(String title) {
        this.title = title;
    }
    
//    public void print() {
//        System.out.println(title);
//    }

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
		if (!(e instanceof Table)) {
			return false;
		}
		else {
			return ((Table) e).title.equals(this.title);
		}
	}

	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visitTable(this);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
}

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
public class Section implements Element, Visitee {
    private String name;
    private ArrayList<Element> subElements = new ArrayList<>();
    
    /**
     * 
     * @param name
     */
    public Section(String name) {
        this.name = name;
    }
    /**
     * 
     */
//    public void print(){
//        System.out.println(name);
//        for (Element el : subElements) {
//        	el.print();
//        }
//            
//    }
//    
    /**
     * @throws Exception
     * 
     */
	@Override
	public void add(Element e) throws Exception {
		// TODO Auto-generated method stub
		try {
			for (Element elem : subElements) {
				if (elem.find(e)) {
					throw new Exception("Duplicate element found!");
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		this.subElements.add(e);
	}
	
	/**
	 * 
	 */
	@Override
	public Element get(int poz) {
		// TODO Auto-generated method stub
		if (poz < 0 || poz >= this.subElements.size()) {
			// alternativa aruncam exceptie
			return null;
		}
		return this.subElements.get(poz);
	}
	/**
	 * 
	 */
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		this.subElements.remove(e);
	}
	@Override
	public boolean find(Element e) {
		// TODO Auto-generated method stub
		for (Element elem : subElements) {
			if (elem.find(e)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visitSection(this);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the subElements
	 */
	public ArrayList<Element> getSubElements() {
		return subElements;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param subElements the subElements to set
	 */
	public void setSubElements(ArrayList<Element> subElements) {
		this.subElements = subElements;
	}
	
}

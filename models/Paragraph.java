/**
 * 
 */
package lab6.models;
import lab6.services.*;

/**
 * @author Diana Anton
 *
 */
public class Paragraph implements Element, Visitee {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }
//    public void print(){
//    	if (alignStrategy != null) {
//    		alignStrategy.render(this, new Context());
//    	}
//    	else {
//    		System.out.println("Paragraph: " + text);
//    	}        
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
		if (!(e instanceof Paragraph)) {
			return false;
		}
		else {
			return ((Paragraph) e).text.equals(this.text);
		}
	}
	
	public String getName() {
		return this.text;
	}
	
	public void setAlignStrategy(AlignStrategy align) {
		this.alignStrategy = align;
	}
	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visitParagraph(this);
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @return the alignStrategy
	 */
	public AlignStrategy getAlignStrategy() {
		return alignStrategy;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
}

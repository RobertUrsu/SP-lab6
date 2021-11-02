/**
 * 
 */
package lab6.models;
import lab6.services.*;
/**
 * @author Diana Anton
 *
 */
public class ImageProxy implements Picture, Element, Visitee{
	private String url;
	private Dimension dim;
	private Image realImage;
	
	public ImageProxy(String url) {
		// TODO Auto-generated constructor stub
		this.url = url;
		this.dim = new Dimension(5, 10);
	}
	
//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		Image img = loadImage();
//		img.print();
//	}

	@Override
	public void add(Element e) throws Exception {
		// TODO Auto-generated method stub
		// nu se implementeaza
	}

	@Override
	public Element get(int poz) {
		// TODO Auto-generated method stub
		// nu se implementeaza
		return null;
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		// nu se implementeaza
	}

	@Override
	public boolean find(Element e) {
		// TODO Auto-generated method stub
		// nu se implementeaza
		return false;
	}

	@Override
	public String url() {
		// TODO Auto-generated method stub
		return url;
	}

	@Override
	public Dimension dim() {
		// TODO Auto-generated method stub
		return dim;
	}
	
	public Image loadImage() {
		if (realImage == null) {
			realImage = new Image(url);
		}
		return realImage;
	}

	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visitImageProxy(this);
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the dim
	 */
	public Dimension getDim() {
		return dim;
	}

	/**
	 * @return the realImage
	 */
	public Image getRealImage() {
		return realImage;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param dim the dim to set
	 */
	public void setDim(Dimension dim) {
		this.dim = dim;
	}

	/**
	 * @param realImage the realImage to set
	 */
	public void setRealImage(Image realImage) {
		this.realImage = realImage;
	}
	
}

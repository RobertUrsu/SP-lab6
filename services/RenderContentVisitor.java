package lab6.services;

import lab6.models.*;
import java.util.ArrayList; 

public class RenderContentVisitor implements Visitor {

	@Override
	public void visitBook(Book b) {
		// TODO Auto-generated method stub
		System.out.println("Book: " + b.getTitle() + "\n");
		System.out.println("Authors: ");
		ArrayList<Author> authors = b.getAuthors();
		ArrayList<Element> content = b.getContent();
		
		for (Author a : authors) {
			a.print();
		}
		System.out.println("\n");
		
		for(Element el : content) {
			if (el instanceof Visitee) {
				Visitee viz = (Visitee) el;
				viz.accept(this);
			}
			else {
				System.out.println("ERROR!");
			}
		}
	}

	@Override
	public void visitSection(Section s) {
		// TODO Auto-generated method stub
		System.out.println(s.getName());
		ArrayList<Element> elements = s.getSubElements();
		for (Element el : elements) {
			if (el instanceof Visitee) {
				Visitee viz = (Visitee) el;
				viz.accept(this);
			}
			else {
				System.out.println("ERROR!");
			}
		}
	}

	@Override
	public void visitTableOfContents(TableOfContents table) {
		System.out.println(table.getName());
	}

	@Override
	public void visitParagraph(Paragraph p) {
		// TODO Auto-generated method stub
		if (p.getAlignStrategy() != null) {
			p.getAlignStrategy().render(p, new Context());
    	}
    	else {
    		System.out.println("Paragraph: " + p.getText());
    	}  
	}

	@Override
	public void visitImageProxy(ImageProxy image) {
		// TODO Auto-generated method stub
		Image img = image.loadImage();
		// img.print(); - nu mai e folosit
		System.out.println(image.getUrl());
		visitImage(img);
	}

	@Override
	public void visitImage(Image img) {
		// TODO Auto-generated method stub
    	if (img.getContent() != null) {
    		System.out.println("Image with name: " + img.getImageName() + "content: " + img.getContent());
    	}
    	else {
    		System.out.println("Image with name: " + img.getImageName());
    	} 
	}

	@Override
	public void visitTable(Table tbl) {
		// TODO Auto-generated method stub
		System.out.println(tbl.getTitle());
	}
	
}

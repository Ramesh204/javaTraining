package com.training;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Parser extends DefaultHandler {

	boolean element = true;
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
//		super.characters(ch, start, length);
		
		
		
	}

	@Override
	public void endDocument() throws SAXException {
		
		//super.endDocument();
		System.out.println("parsing ends");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		//super.endElement(uri, localName, qName);
		System.out.println(localName);
	}

	@Override
	public void startDocument() throws SAXException {
				//super.startDocument();
				System.out.println("parsing starts");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	
		//super.startElement(uri, localName, qName, attributes);
		
		System.out.println(uri);
		
		
		
		
	}

	
	
	
	
	
}

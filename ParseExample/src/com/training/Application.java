package com.training;

import javax.xml.XMLConstants;

import org.xml.sax.*;
import org.xml.sax.helpers.XMLReaderFactory;

public class Application {

	public static void main(String[] args) {
		
		try {
			XMLReader parser = XMLReaderFactory.createXMLReader();
			parser.setContentHandler(new Parser());
			parser.parse("src/class.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

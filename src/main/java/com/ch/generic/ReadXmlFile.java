package com.ch.generic;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
/**
 * Purpose : This class contains method to read data from XMLfile.
 */
public class ReadXmlFile {
	public String GL_TEST_BROWSER = "";
	public String GL_TEST_PLATFORM = "";
	public String GL_TEST_URL = "";
	public String GL_TEST_EMAIL = "";

	public boolean getXmlValues() throws Exception {
		try {
			File fXmlFile = new File("./pom.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("properties");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String url = eElement.getElementsByTagName("Application.URL").item(0).getTextContent();
					String platform = eElement.getElementsByTagName("Application.Platform").item(0).getTextContent();
					String browser = eElement.getElementsByTagName("Application.Browser").item(0).getTextContent();
					String testEmailIDs = eElement.getElementsByTagName("Test.EmailIDs").item(0).getTextContent();
					System.out.println(url);
					System.out.println(platform);
					System.out.println(browser);
					System.out.println(testEmailIDs);
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void main(String argv[]) throws Exception {
		ReadXmlFile xml = new ReadXmlFile();
		xml.getXmlValues();
	}
}

package com.ch.listeners;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.log4testng.Logger;
import org.testng.xml.XmlSuite;
//import CH.ExcelUtils.Property_Lib;
/**
 * Purpose : This class contains methods to create a html report of the execution result.
 */
public class TestReporter implements IReporter {
	public PrintWriter m_out;
	private static final Logger L = Logger.getLogger(TestReporter.class);
	String strResultFile = "";
	String strNewResultFile = "";
	String strToEmail = "";
	String strPOMFile = "";
	
	//Main function to call the function for report header,  Summary, Footer, Archive and send email functions
	public void generateReport(List<XmlSuite> xml, List<ISuite> suites, String outdir) {
		ReporterLib Lib = new ReporterLib();
		strResultFile = "CH_Automation-TestReport.html";
		try {
			m_out = Lib.createWriter(outdir, strResultFile);
		} catch (IOException e) {
			L.error("output file", e);
			return;
		}
		Lib.startHtml(m_out);
		Lib.generateSuiteSummaryReport(suites, m_out);
		Lib.generateMethodSummaryReport(suites, m_out);
		try {
			Lib.generateFooterDetails(m_out);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		Lib.endHtml(m_out);
		m_out.flush();
		m_out.close();
		strNewResultFile = Lib.ArchiveFile(outdir, strResultFile);
		//strPOMFile = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "POMFILE");
		strPOMFile = "./POM.xml";
		try {
			strToEmail = ReporterLib.GetEnvironmentVariable(strPOMFile, "Test.EmailIDs");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(strToEmail!="" && strNewResultFile!=""){
			try {
				Lib.sendMail(strNewResultFile, strToEmail);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


package com.ch.excelutils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * Purpose: This class contains methods to use data from excel sheets.
 *
 */
public class ExcelLibrary
{
public static String getData(String xlPath,String sheetName,int rowNum,int cellNum)
{
	String data="";
	 try
	 {
		FileInputStream fis=new FileInputStream(xlPath);
		Workbook w1= WorkbookFactory.create(fis);
		Sheet s1=w1.getSheet(sheetName);
		 Row r1=s1.getRow(rowNum);
		  Cell c1=r1.getCell(cellNum);
		  data=c1.getStringCellValue();
		  return data;
		 }
	  
	  catch(NullPointerException e)
	   {
		 return "";
	   }
	  catch(Exception e)
	   {
		  e.printStackTrace();
		  return "";
	   }
	  
	  
} 
public static void setData(String xlPath,String sheetName,int rowNum,int cellNum,String data)

{
	  try
	    {
		  FileInputStream fis=new FileInputStream(xlPath);
		  Workbook w1=WorkbookFactory.create(fis);
		  Sheet s1=w1.getSheet(sheetName);
		  Row r1=s1.createRow(rowNum);
		  Cell c1=r1.createCell(cellNum);
		  c1.setCellValue(data);
		  
		  FileOutputStream fos=new FileOutputStream(xlPath);
		  w1.write(fos);
		  
		 }
	  
	  catch(Exception e)
	   {
		  e.printStackTrace();
	   }
	  

}
public static int getNumberData(String xlPath,String sheetName,int rowNum,int cellNum)
{
	int data=-1;
	 try
	 {
		FileInputStream fis=new FileInputStream(xlPath);
		Workbook w1= WorkbookFactory.create(fis);
		Sheet s1=w1.getSheet(sheetName);
		  Row r1=s1.getRow(rowNum);
		  Cell c1=r1.getCell(cellNum);
		  data=(int)(c1.getNumericCellValue());
		  return data;
		 }
	  
	  catch(Exception e)
	   {
		  e.printStackTrace();
		  return data;
	   }
	  
	  
	 
} 

		
	
	



}
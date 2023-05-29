package com.twogoeun.cooktalk;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;



public class DataSourceTest{
 
 @Test
 public void TestConnect(){
	 try{
	   Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/cooktalk", "goni", "twogoni414826" );
	   System.out.println( "Connection success" );
	  
	 }catch(Exception e){
		 e.printStackTrace( );
	 }
 }
 
}
package edu.npmg.javaorm.tests;

import javax.naming.NamingException;

import edu.npmg.javaorm.ConnectionProvider;
import edu.npmg.javaorm.DBAccessConnectionProvider;
import edu.npmg.javaorm.QueryProvider;
import edu.npmg.javaorm.StandardQueryProvider;

public class Main
{
	public static void main(String[] args)
	{
		String connectionString = "";
		ConnectionProvider connectionProvider = null;
		
		try
		{
			connectionProvider = new DBAccessConnectionProvider(connectionString);
		}
		catch (NamingException e)
		{
			e.printStackTrace();
		}
		
		QueryProvider queryProvider = new StandardQueryProvider(connectionProvider);
	}
}

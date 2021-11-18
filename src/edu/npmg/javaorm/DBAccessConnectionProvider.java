package edu.npmg.javaorm;

import javax.naming.NamingException;

public class DBAccessConnectionProvider extends BaseConnectionProvider
{
	public DBAccessConnectionProvider(String connectionString) throws NamingException
	{
		super(connectionString);
	}
}

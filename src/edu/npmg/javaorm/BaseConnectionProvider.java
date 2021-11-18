package edu.npmg.javaorm;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class BaseConnectionProvider implements ConnectionProvider
{	
	protected DataSource dataSource;
	
	protected BaseConnectionProvider(String connectionString) throws NamingException
	{
		if (connectionString == null || connectionString.isEmpty())
		{
			throw new IllegalArgumentException("Connection string cannot be null or empty");
		}
		
		Context context = new InitialContext();
		dataSource = (DataSource) context.lookup(connectionString);
	}

	@Override
	public Connection createConnection() throws SQLException
	{
		return dataSource.getConnection();
	}
}

package edu.npmg.javaorm;

import java.sql.SQLException;

public abstract class DBContext
{
	private final QueryProvider queryProvider;
	
	protected DBContext(QueryProvider queryProvider) throws SQLException
	{
		this.queryProvider = queryProvider;
	}
	
	public void saveChanges()
	{
		throw new UnsupportedOperationException();
	}
}

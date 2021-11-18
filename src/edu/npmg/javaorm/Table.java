package edu.npmg.javaorm;

public class Table<T>
{
	private final QueryProvider queryProvider;
	
	public Table(QueryProvider queryProvider)
	{
		this.queryProvider = queryProvider;
	}
	
	public void insert(T model)
	{
		throw new UnsupportedOperationException();
	}
	
	public void delete(T model)
	{
		throw new UnsupportedOperationException();
	}
	
	public QueryBuilder select()
	{
		throw new UnsupportedOperationException();
	}
}

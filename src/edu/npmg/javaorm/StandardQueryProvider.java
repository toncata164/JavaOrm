package edu.npmg.javaorm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class StandardQueryProvider implements QueryProvider
{
	private final ConnectionProvider connectionProvider;
	
	public StandardQueryProvider(ConnectionProvider connectionProvider)
	{
		this.connectionProvider = connectionProvider;
	}
	
	@Override
	public ResultSet executeSelect(String query, String... args) throws SQLException
	{
		Connection connection = this.connectionProvider.createConnection();
		PreparedStatement statement = prepareStatement(connection, query, args);
		ResultSet resultSet = statement.executeQuery();
		connection.close();
		return resultSet;
	}

	@Override
	public void executeUpdate(String query, String... args) throws SQLException
	{
		Connection connection = this.connectionProvider.createConnection();
		PreparedStatement statement = prepareStatement(connection, query, args);
		statement.executeUpdate();
		connection.close();
	}

	protected PreparedStatement prepareStatement(Connection connection, String query, String... args) 
			throws SQLException
	{	
		PreparedStatement statement = connection.prepareStatement(query);
		
		for (int i = 0; i < args.length; i++)
		{
			statement.setString(i + 1, args[i]);
		}
		
		return statement;
	}
}

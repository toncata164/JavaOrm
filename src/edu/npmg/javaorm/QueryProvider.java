package edu.npmg.javaorm;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface QueryProvider
{
	ResultSet executeSelect(String query, String... args) throws SQLException;
	
	void executeUpdate(String query, String... args) throws SQLException;
}

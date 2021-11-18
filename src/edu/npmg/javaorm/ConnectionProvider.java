package edu.npmg.javaorm;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionProvider
{
	Connection createConnection() throws SQLException;
}

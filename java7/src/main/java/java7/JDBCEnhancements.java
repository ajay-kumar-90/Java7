package java7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCEnhancements {

	public static void main(String[] args) throws Exception {
		viewResults();
		createJDBCRowSet();
	}

	private static void createJDBCRowSet() throws SQLException {
		try (JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();) {
			jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/organization");
			jdbcRowSet.setUsername("root");
			jdbcRowSet.setPassword("root");
			jdbcRowSet.setCommand("select * from employee");
			jdbcRowSet.execute();
			while (jdbcRowSet.next()) {
				System.out.println(
						jdbcRowSet.getString("Name") + jdbcRowSet.getInt("AGE") + jdbcRowSet.getString("DEPARTMENT"));
			}

		}

	}

	private static void viewResults() throws SQLException {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "root");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from employee");) {
			while (resultSet.next()) {
				System.out.println(
						resultSet.getString("NAME") + resultSet.getInt("AGE") + resultSet.getString("DEPARTMENT"));
			}
		}

	}

}

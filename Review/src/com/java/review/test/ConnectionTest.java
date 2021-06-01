package com.java.review.test;

import java.sql.*;

/*
 hr/hr 계정에 JDBC를 이용하여 Connection 연결
 */
public class ConnectionTest {
	public static void main(String args[]) throws SQLException {
		Connection();
	}

	public static Connection Connection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			System.out.println("연결 성공!!");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver를 찾지 못했습니다.");
		} catch (SQLException e) {
			System.err.println("SQLError!!");
		}
		return conn;

	}

}

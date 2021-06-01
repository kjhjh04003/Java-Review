package com.java.review.test;

import java.sql.*;

public class HRSearchEmployee {
	public static void main(String args[]) {

		/*
		 * select last_name, email, phone_number, hire_date from employees where
		 * first_name like '%k%' or last_name like '%k';
		 */

		Connection conn = null;
		Statement st = null;
		ResultSet rst = null;

		try {
			conn = conn();
			st = conn.createStatement();
			
			String sql = "SELECT last_name, email, phone_number, hire_date "
					+"FROM employees WHERE first_name like ";

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static Connection conn() {

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc.oracle.thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			System.out.println("연결 성공");
			System.out.println("============");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이브 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}

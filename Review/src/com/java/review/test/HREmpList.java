package com.java.review.test;

import java.sql.*;

// 사원의 이름과 매니저 이름을 함께 출력
public class HREmpList {
	public static void main(String args[]) {

		Connection conn = null;
		Statement st = null;
		ResultSet rst = null;
		int count = 0;

		try {
			conn = conn();
			st = conn.createStatement();

			String sql = "SELECT emp.first_name, emp.last_name, ma.last_name " + "FROM employees emp, employees ma "
					+ "WHERE ma.employee_id = emp.manager_id";
			rst = st.executeQuery(sql);

			while (rst.next()) {
				String fname = rst.getString(1);
				String lname = rst.getString(2);
				String mname = rst.getString(3);

				System.out.printf("%s %s %s%n", fname, lname, mname);
				count = rst.getRow();

			}
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static Connection conn() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			System.out.println("연결 성공");
			System.out.println("========================");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
			System.out.println("=========================");
		}

		return conn;

	}

}

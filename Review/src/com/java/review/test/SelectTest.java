package com.java.review.test;

import java.sql.*;

public class SelectTest {
	public static void main(String arts[]) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = connection();
			st = conn.createStatement();

			String sql = "SELECT * FROM departments";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				Long deptID = rs.getLong(1); // 1번째 컬럼의 Long 데이터
				String deptName = rs.getString("department_name"); // 컬럼의 표시이름
				Long managerID = rs.getLong(3);
				Long locationID = rs.getLong(4);
				System.out.printf("%d:%s%n", deptID, deptName, managerID, locationID);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static Connection connection() throws SQLException {
		Connection conn = null;

		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Connection 얻기
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "hr", "hr");
		} catch (ClassNotFoundException e) {
			System.err.println("jdbc 드라이버를 로드하지 못했습니다.");
		}
		return conn;
	}

}

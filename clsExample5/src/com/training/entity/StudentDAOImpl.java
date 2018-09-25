package com.training.entity;

import java.sql.*;

import com.training.utils.DbConnections;
import com.training.utils.StudentDAO;

public class StudentDAOImpl implements StudentDAO {

	
	public StudentDAOImpl() {
		super();
		conn = DbConnections.getOracleConnection();
	}

	private Connection conn;
	
	@Override
	public int addStudent(Student student) {
		
		String sql = "insert into studentanant values(?,?,?)";
		PreparedStatement pstmt = null;
		int rowAdded =0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, student.getStudentId());
			pstmt.setString(2, student.getStudentName());
			pstmt.setLong(3, student.getCourseId());
			rowAdded= pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				pstmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return rowAdded;
	}

}

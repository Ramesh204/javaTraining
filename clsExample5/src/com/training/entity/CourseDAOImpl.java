package com.training.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.*;

import com.training.utils.CourseDAO;
import com.training.utils.DbConnections;

public class CourseDAOImpl implements CourseDAO {

	public CourseDAOImpl() {
		super();
		conn = DbConnections.getOracleConnection();
	}


	private Connection conn;
	
	
	@Override
	public int addCourse(Course course) {
		String sql = "insert into coursesanant values(?,?)";
		PreparedStatement pstmt = null;
		int rowAdded =0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, course.getCourseId());
			pstmt.setString(2, course.getCourseName());
			 rowAdded = pstmt.executeUpdate();
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


	@Override
	public List<Student> getStudentsBycourseName(String courseName) {
		
		String sql ="select * from studentanant inner join coursesanant on studentanant.courseId=coursesanant.courseId where courseName=?";
		PreparedStatement pstmt = null;
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, courseName);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				long studentId = rs.getLong("studentId");
				String studentName = rs.getString("studentName");
				long courseId = rs.getLong("courseId");
				
				Student student = new Student(studentId,studentName,courseId);
				studentList.add(student);
			}
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
		
		return studentList;
	}


	


	


	
	


}

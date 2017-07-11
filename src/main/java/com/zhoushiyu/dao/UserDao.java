package com.zhoushiyu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.zhoushiyu.domain.User;

@Repository
public class UserDao {
	/*private JdbcTemplate jdbcTemplate;
	@Autowired //自动注入JdbcTemplate 的 bean
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	
	/*
	 * 使用mybatis进行数据库访问
	 */
	
	
	/*public User getUserMsg(String userName) {
		final User user = new User();
		String sqlstr = " SELECT * FROM user WHERE userName = ? ";
		jdbcTemplate.query(sqlstr, new Object[] {userName}, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				user.setUserID(rs.getInt("userID"));
				user.setUserName(rs.getString("userName"));
				user.setHasNumber(rs.getInt("hasNumber"));
				
			}
		});
		return user;
	}
	
	public int addUser(final User user) {
		String sqlstr = " INSERT INTO user (userName) VALUES (?)";
		return jdbcTemplate.update(sqlstr, new PreparedStatementSetter () {

			public void setValues(java.sql.PreparedStatement ps) throws SQLException {
				ps.setString(1, user.getUserName());  
			}  
		});
	}
	
	public int deleteUser(final User user) {
		String sqlstr = " DELETE TABLE user WHERE userID = ?";
		return jdbcTemplate.update(sqlstr, new PreparedStatementSetter () {

			public void setValues(java.sql.PreparedStatement ps) throws SQLException {
				ps.setInt(1, user.getUserID());  
			}  
		});
	}*/
}

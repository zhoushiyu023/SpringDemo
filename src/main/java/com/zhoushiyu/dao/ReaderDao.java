package com.zhoushiyu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.zhoushiyu.domain.Reader;
import com.zhoushiyu.domain.User;

@Repository
public class ReaderDao {
	/*private JdbcTemplate jdbcTemplate;
	@Autowired //自动注入JdbcTemplate 的 bean
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	*/
	/*public Reader getReaderMsgByUserName(String userName) {
		final Reader reader = new Reader();
		String sqlstr = " SELECT * FROM reader WHERE userName = ? ";
		jdbcTemplate.query(sqlstr, new Object[] {userName}, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				reader.setBookID(rs.getInt("bookID"));
				reader.setUserID(rs.getInt("userID"));
				reader.setState(rs.getInt("state"));
				reader.setUpdateTime(rs.getDate("updateTime").toLocalDate());
				reader.setId(rs.getInt("id"));
			}
		});
		return reader;
	}
	
	
	public int addReader(final Reader reader) {
		String sqlstr = " INSERT INTO reader (userID, bookID) VALUES (?,?)";
		return jdbcTemplate.update(sqlstr, new PreparedStatementSetter () {

			public void setValues(java.sql.PreparedStatement ps) throws SQLException {
				ps.setInt(1, reader.getUserID());  
				ps.setInt(2, reader.getBookID());
			}  
		});
	}
	
	public int changeReaderState(final int state, final Reader reader) {
		String sqlstr = "  UPDATE reader SET state = ? WHERE id = ?";
		return jdbcTemplate.update(sqlstr, new PreparedStatementSetter () {

			public void setValues(java.sql.PreparedStatement ps) throws SQLException {
				ps.setInt(1, state);  
				ps.setInt(2, reader.getId());
			}  
		});
	}*/
}

package com.zhoushiyu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.PreparedStatement;
import com.zhoushiyu.domain.Book;

@Component
public class BookDao {
	/*private JdbcTemplate jdbcTemplate;
	@Autowired //自动注入JdbcTemplate 的 bean
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	
	/*public Book getBookMsg(String bookName) {
		final Book book = new Book();
		String sqlstr = " SELECT * FROM book WHERE bookName = ? ";
		jdbcTemplate.query(sqlstr, new Object[] {bookName}, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				book.setBookID(rs.getInt("bookID"));
				book.setBookName(rs.getString("bookName"));
				book.setAuthorName(rs.getString("authorName"));
				book.setHasNumber(rs.getInt("hasNumber"));
				book.setUpdateTime(rs.getDate("updateTime").toLocalDate());
				
			}
		});
		return book;
	}
	
	public int addBook(final Book book) {

		String sqlstr = " INSERT INTO book (bookName, authorName,hasNumber) VALUES (?,?,?)";
		return jdbcTemplate.update(sqlstr, new PreparedStatementSetter () {

			public void setValues(java.sql.PreparedStatement ps) throws SQLException {
				ps.setString(1, book.getBookName());  
                ps.setString(2, book.getAuthorName());
                ps.setInt(3, book.getHasNumber());
				
			}  
		});
		
	}
	
	public int returnBook(final Book book) {
		String sqlstr = " UPDATE book SET hasNumber = ? WHERE bookID = ?";
		return jdbcTemplate.update(  
                sqlstr, new PreparedStatementSetter(){  

					public void setValues(java.sql.PreparedStatement ps) throws SQLException {
						ps.setInt(1, book.getHasNumber() + 1);
						ps.setInt(2, book.getBookID());
					}  
                }  
        );  
	}
	
	public int borrowBook(final Book book) {
		String sqlstr = " UPDATE book SET hasNumber = ? WHERE bookID = ?";
		if(book.getHasNumber() - 1 < 0) {
			return -1;
		}
		return jdbcTemplate.update(sqlstr, new PreparedStatementSetter() {

			public void setValues(java.sql.PreparedStatement ps) throws SQLException {
				ps.setInt(1, book.getHasNumber() - 1);
				ps.setInt(2, book.getBookID());
				
			}
			
		});
	}
	
	public int deleteBook(final Book book) {
		String sqlstr = "DELETE TABLE book WHERE bookName = ?";
		return jdbcTemplate.update(sqlstr, new Object[]{book.getBookID()}, new int[]{java.sql.Types.INTEGER});
	}
	
	public int add() {
		return 1;
	}*/
}

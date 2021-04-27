package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

@Component
public class BookDAO { // JdbcTemplate를 이용함
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MapperClass mapper;
	
	// insert
	public void insert_data(BookDTO dto) {
		String sql = "insert into book1 values(?, ?, ?, ?)";
		jdbcTemplate.update(sql, dto.getTitle(), 
				dto.getAuthor(), dto.getPrice(), dto.getEmail());
	}
	
	// update
	public void update_data(BookDTO dto) {
		String sql = "update book1 set price = ? where title = ?";
		jdbcTemplate.update(sql, dto.getPrice(), dto.getTitle());
	}
	
	// delete
	public void delete_data(BookDTO dto) {
		String sql = "delete from book1 where title = ?";
		jdbcTemplate.update(sql, dto.getTitle());
	}
	
	// select (얘만 query메소드)
	public List<BookDTO> select_data(){
	      String sql = "select * from book1";
	      List<BookDTO> list = jdbcTemplate.query(sql, mapper);
	      return list;
	}
}

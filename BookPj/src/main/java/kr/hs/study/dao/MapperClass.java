package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

@Component
public class MapperClass implements RowMapper<BookDTO>{

	// 객체를 만들어주는 mapper
	 @Override
	   public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
	      BookDTO bean = new BookDTO();
	      bean.setTitle(rs.getString("title"));
	      bean.setAuthor(rs.getString("author"));
	      bean.setPrice(rs.getInt("price"));
	      bean.setEmail(rs.getString("email"));
	      return bean;
	   }
		
}

package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class MapperClass implements RowMapper<LoginDTO>{

	// 객체를 만들어주는 mapper
	 @Override
	   public LoginDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
	      LoginDTO bean = new LoginDTO();
	      bean.setUserId(rs.getString("userId"));
	      bean.setUserPass(rs.getString("userPass"));
	      return bean;
	   }
		
}

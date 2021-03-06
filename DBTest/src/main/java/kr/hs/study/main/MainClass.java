package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// LoginDAO 가져오기
		LoginDAO dao = ctx.getBean(LoginDAO.class);
		// LoginDTO 가져오기(id:bean1)
		LoginDTO bean1 = ctx.getBean(LoginDTO.class);
		
		// bean1에 kim, 1111 세팅
		bean1.setUserId("kim");
		bean1.setUserPass("1111");
		
		bean1.setUserId("lee");
		bean1.setUserPass("2222");
		
		bean1.setUserId("kim");
		bean1.setUserPass("2222");
		
		// dao의 메소드 호출
//		dao.insert_data(bean1);
		System.out.println("저장완료");
		
		LoginDTO bean2 = ctx.getBean(LoginDTO.class);
		bean2.setUserId("lee");
		bean2.setUserPass("3333");
//		dao.update_data(bean2);
		System.out.println("수정완료");
		
		LoginDTO bean3 = ctx.getBean(LoginDTO.class);
		bean3.setUserId("kim");
//		dao.delete_data(bean3);
		System.out.println("삭제완료");

		List<LoginDTO> list = dao.select_data();
		for(LoginDTO dto : list) {
			System.out.println(dto.getUserId());
			System.out.println(dto.getUserPass());
		}
		System.out.println("출력완료");
		
		ctx.close();

	}

}

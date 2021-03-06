package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.BookDAO;
import kr.hs.study.dto.BookDTO;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// LoginDAO 가져오기
		BookDAO dao = ctx.getBean(BookDAO.class);
		// LoginDTO 가져오기(id:bean1)
		BookDTO bean1 = ctx.getBean(BookDTO.class);
		
		// bean1에 kim, 1111 세팅
		bean1.setTitle("Spring1");
		bean1.setAuthor("지은이");
		bean1.setPrice(10000);
		bean1.setEmail("s2019s13");

		// dao의 메소드 호출
//		dao.insert_data(bean1);
		System.out.println("저장완료");
		
		BookDTO bean2 = ctx.getBean(BookDTO.class);
		bean2.setPrice(20000);
		bean2.setTitle("Spring1");
//		dao.update_data(bean2);
		System.out.println("수정완료");
		
		BookDTO bean3 = ctx.getBean(BookDTO.class);
		bean3.setTitle("Java1");
		dao.delete_data(bean3);
		System.out.println("삭제완료");

		List<BookDTO> list = dao.select_data();
		for(BookDTO dto : list) {
			System.out.println(dto.getTitle());
			System.out.println(dto.getAuthor());
			System.out.println(dto.getPrice());
			System.out.println(dto.getEmail());
		}
		System.out.println("출력완료");
		
		ctx.close();

	}

}

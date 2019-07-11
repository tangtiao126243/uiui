package com.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
//import org.apache.ibatis.io.Resources;







import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pojo.Student;

public class 查所有学生 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Reader reader=Resources.getResourceAsReader("sqlMapperConfig.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=factory.openSession();
		List<Student> list=session.selectList("com.dao.StudentDAO.findall");
		for (Student student:list
			 ) {
			System.out.println("sid:"+student.getSid()+"sname="+student.getSname()
			);
		}
				
				
	}

}

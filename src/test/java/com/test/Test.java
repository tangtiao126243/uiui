package com.test;

import com.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

//import org.apache.ibatis.io.Resources;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Reader reader=Resources.getResourceAsReader("sqlMapperConfig.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=factory.openSession();
				Student student=new Student();
			//	student.setSid(9);
				student.setSname("张99");
				//student.setCs(java.sql.Timestamp.valueOf("2019-01-01 20:20:20"));
				session.insert("com.dao.StudentDAO.add",student);
				session.commit();
				session.close();
				
				
	}

}

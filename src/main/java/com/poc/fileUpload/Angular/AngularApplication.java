package com.poc.fileUpload.Angular;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AngularApplication {
	private static final String conf = "mybatis.xml";

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AngularApplication.class, args);

        context.getBean(AngularApplication.class).setUp();
	}
	
	public void setUp(){
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(conf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
SqlSessionFactory sessionFactory = builder.build(reader);
SqlSession session = sessionFactory.openSession();
System.out.println("At begining");

	}
}

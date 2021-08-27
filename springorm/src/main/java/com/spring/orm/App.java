package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.studentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        studentDao studentDao=context.getBean("studentDao",studentDao.class);
        Student student=new Student(11,"Ravikant Maurya","Ghazipur");
        int r=studentDao.insert(student);
        System.out.println("data inserted into table"+ student+"   "+r);
    }
}

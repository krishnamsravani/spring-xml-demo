package com.stackroute.spring;



import com.stackroute.spring.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext3=new ClassPathXmlApplicationContext("Constructorbean.xml");
        Movie movie1=(Movie)applicationContext3.getBean("movie1");
        System.out.println(movie1.toString());
    }
}

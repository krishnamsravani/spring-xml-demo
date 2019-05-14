package com.stackroute.spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.stackroute.spring.domain.Movie;
import org.springframework.core.io.Resource;


public class Main
{
    public static void main(String[] args) {

        // Task-1 using Application context
        ApplicationContext bean=new ClassPathXmlApplicationContext("bean.xml");
        Movie movie =(Movie)bean.getBean("movie");
        System.out.println(movie.toString());
        System.out.println(movie.getActor());


        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Movie movie1 = (Movie) beanFactory.getBean("movie1");
        System.out.println(movie1.getActor());
        System.out.println(movie1.toString());

        //Task-1 using XmlBeanFactory
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("bean.xml"));
        Movie movie2=(Movie)factory.getBean("movie2");
        System.out.println(movie2.getActor());
        System.out.println(movie2.toString());
    }
}

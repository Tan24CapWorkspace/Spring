package com.cg.iocdemo2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cg.iocdemo.Address;
import com.cg.iocdemo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Resource rs = new ClassPathResource("spring.xml");
    	XmlBeanFactory context = new XmlBeanFactory(rs);
    	
    	
    	
    	Address add = context.getBean("address", Address.class);

    	// Get Bean of Type Employee AND ID emp
    	Employee emp = context.getBean("emp", Employee.class);

    	// Get Bean with ID emp, but DON'T assign Type
    	Employee emp2 = (Employee) context.getBean("emp");

    	System.out.println("Emp :" + emp.hashCode());
    	System.out.println("Emp2 :" + emp2.hashCode());
    	System.out.println("First Phone: "+emp.getContacts().get(0));
    	
    	System.out.println(add.getLine1());
    	System.out.println(add.getLine2());
    	System.out.println(add.getCity());
    	*/
    	
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Employee emp = context.getBean("emp", Employee.class);
    	
    	context.close();
    	
    }
}
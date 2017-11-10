package com.niit.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.model.Product;


@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class DBConfiguration
{
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		 System.out.println("----Data Source Creation-----");
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("org.h2.driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/dt");
		dataSource.setUsername("abhi");
		dataSource.setPassword("abhi");
		 System.out.println("----Data Source created-----");
		return dataSource;
				
	}	
	       	
				 /*
				 * <bean id="sessionFactory" class="org.springframework.orm.hibernate4.LocalSessionFactoryBuilder">
				 * <property name="dataSource" ref="dataSource">
				 */
	 @Autowired
	   @Bean(name="sessionFactory")
	 public SessionFactory getSessionFactory(DataSource dataSource)
	 {

         System.out.println("------Hibernate properties creation------");
			//LocalSessionFactoryBuilder lsfb=new LocalSessionFactoryBuilder(dataSource());
		/*	Properties hibernateProperties=new Properties();
			hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
			hibernateProperties.setProperty("hibernate.show_sql", "true");*/
			Properties properties=new Properties();
			   properties.setProperty("hibernate.hbm2ddl.auto", "update");
			   properties.put("hibernate.show_sql", "true");
			   properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			//lsfb.addProperties(hibernateProperties);
			   LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(getH2DataSource());
			   sessionBuilder.addProperties(properties);
			   System.out.println("------Factory Builder object created------");
			   sessionBuilder.addAnnotatedClass(Product.class);
			//An array of Class objects of all the entities
			//Map all entities to relational table
			/*Class classes[]=new Class[]{Product.class};
		    return lsfb.addAnnotatedClasses(classes).buildSessionFactory();*/
			   SessionFactory sessionFactory=sessionBuilder.buildSessionFactory();
			   System.out.println("------Session factory object created------");
			   return sessionFactory;
	}
	
	

	 @Autowired
	   @Bean(name="transactionManager")
	   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	   {

		   HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
				   return transactionManager;
	   }
   

	
}

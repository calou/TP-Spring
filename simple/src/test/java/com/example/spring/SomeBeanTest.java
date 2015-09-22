package com.example.spring;

import com.example.spring.bean.SomeBean;
import com.example.spring.bean.SomeLazyBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SomeBeanTest {

    ApplicationContext applicationContext;

    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("setUp Done");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    @Test
    public void someBeanIsUnic(){
        SomeBean someBean = applicationContext.getBean(SomeBean.class);
        SomeBean anotherBean = applicationContext.getBean(SomeBean.class);
        assertThat(someBean).isEqualTo(anotherBean);
    }

    @Test
    public void allReturnsAllValues(){
        SomeBean someBean = applicationContext.getBean(SomeBean.class);
        List<String> allValues = someBean.all();
        assertThat(allValues).containsExactly("Premier", "Second", "Troisième");
    }

}

package com.example.spring;

import com.example.spring.bean.SomeBean;
import com.example.spring.bean.SomeLazyBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SomeLazyBeanTest {

    ApplicationContext applicationContext;

    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("setUp Done");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    @Test
    public void someLazyBeanIsUnic(){
        SomeLazyBean someLazyBean = applicationContext.getBean(SomeLazyBean.class);
        SomeLazyBean anotherLazyBean = applicationContext.getBean(SomeLazyBean.class);
        assertThat(someLazyBean).isEqualTo(anotherLazyBean);
    }

    @Test
    public void allReturnsAllValues(){
        SomeLazyBean someLazyBean = applicationContext.getBean(SomeLazyBean.class);
        List<String> allValues = someLazyBean.all();
        assertThat(allValues).containsExactly("Premier", "Second", "Troisième");
    }

}

package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // spring container with the help of xml file knows that mybean is class and it nedded to pass when requested.
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        // here we retrive mybean from the context;
        Mybean myBean = (Mybean) context.getBean("myBean");
        myBean.showmessage();
        System.out.println(myBean);

    }
}

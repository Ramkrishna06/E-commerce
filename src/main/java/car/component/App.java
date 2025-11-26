package car.component;

import car.example.bean.Mybean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {


        // spring container with the help of xml file knows that mybean is class and it nedded to pass when requested.
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScan.xml");
        // here we retrive mybean from the context;
        Employee employee =  context.getBean("employee" , Employee.class);
        System.out.println(employee.toString());

    }
}

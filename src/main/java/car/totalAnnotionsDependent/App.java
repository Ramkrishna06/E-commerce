package car.totalAnnotionsDependent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {


        // spring container with the help of xml file knows that mybean is class and it nedded to pass when requested.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // here we retrive mybean from the context;
        Employee employee =  context.getBean("employee" , Employee.class);
        System.out.println(employee.toString());


        System.out.println("Output by Manager class that is dependent on Employee used autowire annotations to pass reference");
        Manager manager =  context.getBean("manager", Manager.class);
        System.out.println(manager.toString());
    }
}

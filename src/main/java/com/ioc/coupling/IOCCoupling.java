package com.ioc.coupling;

import com.ioc.coupling.UserManger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCCoupling {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIocCoupling.xml");

        UserManger userMangerWithWebDb = (UserManger) context.getBean("webBeanWithUserManager");

        System.out.println(userMangerWithWebDb.getUserInfo());




    }
}

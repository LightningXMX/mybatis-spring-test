package test.testcase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.dao.impl.PeopleDAOImpl;
import test.model.People;

/**
 * Created by mingxin on 16/7/23.
 */
public class Test {
    private static ApplicationContext context ;
    static {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
    public static void main(String[] args) {
        People people = new PeopleDAOImpl().getPeopleById(1L);

    }
}

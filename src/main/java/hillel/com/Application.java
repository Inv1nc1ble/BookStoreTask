package hillel.com;



import hillel.com.beans.Owner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/app.xml");

        System.out.println("-----------------");
        System.out.println("[DEBUG] Registered beans:");
        Arrays.stream(context.getBeanDefinitionNames())
                .map(beanName -> "- " + beanName)
                .forEach(System.out::println);

        System.out.println("-----------------");

        Owner owner = context.getBean(Owner.class);
        owner.buyBook();

    }
}

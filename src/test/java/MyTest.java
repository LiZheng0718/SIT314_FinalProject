import com.example.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {    //IOC:对象由Spring创建，管理，装配
    public static void main(String[] args) {
        //获取Spring的上下文对象,
        // 1,拿Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //接下来可以直接获取对象
        //2.需要什么直接获取什么
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
    }
}

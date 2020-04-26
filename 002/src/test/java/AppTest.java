import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Date 2020/4/26 21:42
 * @Author zhouyq
 */
public class AppTest {


    @Test
    public void test01() {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        System.out.println(ctx.getBean("mystudent"));
    }
}

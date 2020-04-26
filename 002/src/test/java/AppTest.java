import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Date 2020/4/26 21:42
 * @Author zhouyq
 */
public class AppTest {


    /**
     *  设值注入： 简单类型属性赋值
     */
    @Test
    public void test01() {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        System.out.println(ctx.getBean("mystudent"));
    }


    /**
     *  设值注入： 引用类型属性赋值，ref作为属性
     */
    @Test
    public void test02() {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        System.out.println(ctx.getBean("mystudent02"));
    }

    /**
     *  设值注入： 引用类型属性赋值，ref作为子标签
     */
    @Test
    public void test03() {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        System.out.println(ctx.getBean("mystudent03"));
    }
}

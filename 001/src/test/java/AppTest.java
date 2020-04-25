import com.zhouyq.spring.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 *  测试方法，使用junit
 *  1. 定义方法为public void 方法名自定义() {}
 *  2. 在方法上面添加@Test
 *  3. 把光标放在方法上面run
 * @Date 2020/4/25 17:32
 * @Author zhouyq
 */
public class AppTest {

    public static final String config = "applicationContext.xml";



    /**
     *  第一个Spring 测试
     */
    @Test
    public void test1() {
        System.out.println("hello Spring!");

        // 加载Spring的配置文件注意事项：
        // 1. 如果Spring的配置文件在类路径（classpath）, 使用ClassPathXmlApplicationContext
        // 2. 如果不在类路径中使用FileSystemXmlApplicationContext 加载
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        // 从容器中获取对象 使用getBean("<bean>的id值")
        SomeService service = (SomeService) ctx.getBean("someService");

        // 调用业务方法
        service.doSome();
    }


    /**
     *  对象创建时间：
     *      默认是在创建容器对象时，把配置文件中的所有对象都创建出来放到容器中
     *
     *  优点：
     *      获取对象的时候，对象已经创建好了，使用的时候不需要再次创建直接获取
     *
     *  缺点：
     *      占内存
     */
    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
    }


    /**
     *  获取容器中对象的信息
     *    1. 对象数量
     *    2. 对象名称
     */
    @Test
    public void test3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        // 获取容器中定义的对象数量
        int num = ctx.getBeanDefinitionCount();
        System.out.println("容器中对象的数量： "+ num);

        // 获取容器中对象名称
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("对象名称: " + name);
        }

    }

    /**
     *  Spring 默认是调用类的无参构造方法
     *  如果没有无参构造方法就会报错
     */
    @Test
    public void test4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ctx.getBean("someService");
        service.doSome();
    }

    /**
     *  测试单例（singleton）：默认创建方式
     *  单例创建时间：
     *      创建容器的时候，会创建所有的单例对象
     *  优点：获取对象的速度快
     *  缺点：占内存
     */
    @Test
    public void test5() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service1 = (SomeService) ctx.getBean("someService_singleton");
        SomeService service2 = (SomeService) ctx.getBean("someService_singleton");
        System.out.println(service1 == service2);
    }


    /**
     *  测试原型（prototype）
     *  原型创建时间：
     *      从容器中获取对象(调用getBean方法)的时候创建对象
     *  优点：不占内存
     *  缺点：获取对象的速度慢
     */
    @Test
    public void test6() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service1 = (SomeService) ctx.getBean("someService_prototype");
        SomeService service2 = (SomeService) ctx.getBean("someService_prototype");
        System.out.println(service1 == service2);
    }
}

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient
{
public static void main(String[] args)
{
 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("DemoCfg.xml");
 Demo d=(Demo)ctx.getBean("db");
    System.out.println("result  "+d.sayHello());
    ctx.close();
}
}

package skr.wtf.learn.springlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import skr.wtf.learn.springlifecycle.config.MyConfiguration;
import skr.wtf.learn.springlifecycle.service.Car;

public class Application {
	public static void main(String[] args) {
		/**
		 * 调用new AnnotationConfigApplicationContext(MyConfiguration.class);会先掉DefaultResourceLoader的构造方法，为属性classLoader赋值，
		 * 接着会调用AbstractApplicationContext的构造方法，为属性resourcePatternResolver赋值
		 * 在会调用GenericApplicationContext的构造方法，为属性beanFactory赋值，默认是用的DefaultListableBeanFactory
		 * 之后调用自己的构造方法，初始化reader和scanner,在reader中会把属性registry赋值成自己，并且将5个root beanDefinition
		 */
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//		context.register(Car.class);
//		context.refresh();
		Car bean = context.getBean(Car.class);
		Car bean1 = context.getBean(Car.class);
		System.out.println(bean==bean1);
	}
}

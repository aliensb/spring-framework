package skr.wtf.learn.springlifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import skr.wtf.learn.springlifecycle.processors.DemoBeanPostProcessor;
import skr.wtf.learn.springlifecycle.service.Car;

@Configuration
@ComponentScan("skr.wtf.learn.springlifecycle")
public class MyConfiguration {
	@Bean(initMethod = "initMethod")
	public Car car(){
		return new Car("toyota");
	}

//	@Bean
//	public DemoBeanPostProcessor demoBeanPostProcessor(){
//		DemoBeanPostProcessor beanPostProcessor=new DemoBeanPostProcessor();
//		return beanPostProcessor;
//	}
}

package skr.wtf.learn.springlifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import skr.wtf.learn.springlifecycle.service.Car;

@Configuration
public class MyConfiguration {
	@Bean
	public Car car(){
		return new Car("toyota");
	}
}

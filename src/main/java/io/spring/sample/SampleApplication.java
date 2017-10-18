package io.spring.sample;

import io.spring.sample.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Autowired
	private UserDao userDao;

    @Bean
    CommandLineRunner commandLineRunner() {
	    return (args) -> System.out.println(this.userDao.findByUsername("admin"));
    }
}

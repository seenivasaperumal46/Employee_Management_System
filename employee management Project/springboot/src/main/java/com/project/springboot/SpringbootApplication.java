package com.project.springboot;

import com.project.springboot.model.Employee;
import com.project.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class  SpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee =new Employee();
		employee.setFirstName("Seeni");
		employee.setLastName("Perumal");
		employee.setEmailId("nseenivasaperumal621@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 =new Employee();
		employee1.setFirstName("rabi");
		employee1.setLastName("subs");
		employee1.setEmailId("geraldrabin621@gmail.com");
		employeeRepository.save(employee1);
	}
}

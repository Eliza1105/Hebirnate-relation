package org.itstep;

import org.itstep.many_to_many.AuthorRepository;
import org.itstep.many_to_many.BookRepository;
import org.itstep.one_to_many.PhoneRepository;
import org.itstep.one_to_many.SubscriberRepository;
import org.itstep.one_to_one_bi.PassportRepository;
import org.itstep.one_to_one_bi.PersonRepository;
import org.itstep.one_to_one_uni.AddressRepository;
import org.itstep.one_to_one_uni.EmployeeRepository;
import org.itstep.one_to_one_uni.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    PersonRepository personRepository;

    @Autowired
    PassportRepository passportRepository;

    @Autowired
    SubscriberRepository subscriberRepository;
    @Autowired
    PhoneRepository phoneRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
/* One-to-one unidirectional
employeeService.deleteEmployeeById(1L);
employeeService.getEmployees().forEach(System.out::println);
employeeService.getAddresses().forEach(System.out::println);

addressRepository.findByCityAndStreet("Minsk", "Pobediteley st.").forEach(System.out::println);

   employeeRepository.findByCity("Vitebsk").forEach(e-> System.out.println());
        employeeRepository.findByCity2("Vitebsk").forEach(e-> System.out.println());
        employeeRepository.findByCity3("Vitebsk").forEach(e-> System.out.println());
        employeeRepository.findByCity4("Vitebsk").forEach(e-> System.out.println());

 */
     /*   personRepository.deleteById(1L);
personRepository.findAll().forEach(System.out::println);
passportRepository.findAll().forEach(System.out::println);
        System.out.println();
        passportRepository.deleteById(2L);
        personRepository.findAll().forEach(System.out::println);
       // passportRepository.findAll().forEach(System.out::println);
        System.out.println();


      */

      /*  subscriberRepository.findAll().forEach(System.out::println);
phoneRepository.findAll().forEach(System.out::println);

       */

authorRepository.findAll().forEach(System.out::println);
bookRepository.findAll().forEach(System.out::println);
    }
}

package ma.inpt.rentingCarApp;

import ma.inpt.rentingCarApp.entities.Car;
import ma.inpt.rentingCarApp.entities.User;
import ma.inpt.rentingCarApp.services.CarService;
import ma.inpt.rentingCarApp.services.NotificationService;
import ma.inpt.rentingCarApp.services.UserService;
import ma.inpt.rentingCarApp.utils.MidnightApplicationRefresh;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class CarRentingApplication {

    // class attributes :
    final CarService carService;
    final UserService userService;
    final NotificationService notificationService;
    final BCryptPasswordEncoder pwEncoder;
    final MidnightApplicationRefresh midAppRef;

    // class constructor :
    public CarRentingApplication(CarService carService, UserService userService, NotificationService notificationService, BCryptPasswordEncoder pwEncoder, MidnightApplicationRefresh midAppRef) {
        this.carService = carService;
        this.userService = userService;
        this.notificationService = notificationService;
        this.pwEncoder = pwEncoder;
        this.midAppRef = midAppRef;
    }

    // class methods :
    public static void main(String[] args) {
        SpringApplication.run(CarRentingApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner() {
//        return args -> {
//
//            User user1 = new User("prathamesh", pwEncoder.encode("prathamesh"), "prathamesh@gmail.com", "Prathameh", "Dhas", "Flat no. 301, Metro polis, Hinjawadi Phase 1", "9991118882", "Nashik");
//            user1.setRole("ROLE_ADMIN");
//
//            User user2 = new User("pratik", pwEncoder.encode("pratik"), "pratik313@gmail.com", "Pratik", "Mahajan", "Flat no. 302, Metro polis, Hinjawadi Phase 1", "9876543210", "Pune");
//            user2.setRole("ROLE_EMPLOYEE");
//
//            User user3 = new User("ashish", pwEncoder.encode("ashish"), "ashish365@gmail.com", "Ashish", "Kushwaha", "Flat no. 303, Metro polis, Hinjawadi Phase 1", "0682670018", "Mumbai");
//            user3.setRole("ROLE_USER");
//
//
//
//            
//          
//
//            
//            
//            userService.save(user1);
//            userService.save(user2);
//            userService.save(user3);
//
//
//
//            
//           
//            Car car1 = new Car("Panamera: Porsche", "Kunal Sehgal", 2021, 3);  // Sports Sedan  
//            Car car2 = new Car("911: Porsche", "Rohan Metha", 2022, 3);  // Sports Car  
//            Car car3 = new Car("R8: Audi", "Aryan Kapoor", 2023, 3);  // Supercar               
//            Car car4 = new Car("Defender: Land Rover", "Rajesh Iyer", 2022, 3);  // Off-road SUV  
//            Car car5 = new Car("Wrangler: Jeep", "Nitin Bansal", 2021, 3);  // Off-road SUV           
//            Car car6 = new Car("488: Ferrari", "Ananya Bhatt", 2019, 3);  // Supercar  
//            Car car7 = new Car("Huracan: Lamborghini", "Dhruv Saxena", 2023, 3);  // Supercar  
//            Car car8 = new Car("Aventador: Lamborghini", "Vikash Singh", 2020, 3);  // Supercar               
//            Car car9 = new Car("Bolero: Mahindra", "Suresh Prasad", 2018, 2);  // Utility Vehicle  
//            Car car10 = new Car("Scorpio: Mahindra", "Rahul Nair", 2021, 2);  // SUV  
//  
//            
//    
//            carService.save(car1);
//            carService.save(car2);
//            carService.save(car3);
//            carService.save(car4);
//            carService.save(car5);
//            carService.save(car6);
//            carService.save(car7);
//            carService.save(car8);
//            carService.save(car9);
//            carService.save(car10);
//
//
//            car1.setTheUser(user3);
//            car1.setReturnDate(LocalDate.of(2025, 1, 23));
//
//
//            car2.setTheUser(user3);
//            car2.setReturnDate(LocalDate.of(2025, 2, 05));
//
//            user3.setCars(Arrays.asList(car1, car2));
//
//            carService.save(car2);
//            carService.save(car1);
//            userService.save(user3);
//
//            midAppRef.midnightApplicationRefresher();
//        };
//    }
}
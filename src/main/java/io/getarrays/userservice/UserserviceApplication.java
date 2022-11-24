package io.getarrays.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserviceApplication.class, args);
    }

//    @Bean
//    CommandLineRunner run(UserService service) {
//        return args -> {
//            service.saveRole(Role.builder().name("ROLE_USER").build());
//            service.saveRole(Role.builder().name("ROLE_MANAGER").build());
//            service.saveRole(Role.builder().name("ROLE_ADMIN").build());
//            service.saveRole(Role.builder().name("ROLE_SUPER_ADMIN").build());
//
//            service.saveUser(User.builder().name("Wagner Amaral").username("wagner").password("123456").build());
//            service.saveUser(User.builder().name("Dejaine Parizotto").username("dejaine").password("123456").build());
//
//            service.addRoleToUser("wagner", "ROLE_MANAGER");
//            service.addRoleToUser("wagner", "ROLE_ADMIN");
//            service.addRoleToUser("wagner", "ROLE_SUPER_ADMIN");
//            service.addRoleToUser("dejaine", "ROLE_USER");
//        };
//    }
}

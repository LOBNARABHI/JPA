package ma.enset.jpa;

import ma.enset.jpa.entities.Role;
import ma.enset.jpa.entities.User;
import ma.enset.jpa.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class JPAUser {
    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
    @Bean
    CommandLineRunner start(UserService userService){
        return args -> {
            User u = new User();
            u.setUsername("user1");
            u.setPassword("123456");
            userService.addNewUser(u);

            User u1 = new User();
            u1.setUsername("admin");
            u1.setPassword("123456");
            userService.addNewUser(u1);

            Stream.of("Student","USER", "ADMIN").forEach(r->{
                Role role=new Role();
                role.setRoleName(r);
                userService.addNewRole(role);
            });
            userService.addRoleToUser("user1","Student");
            userService.addRoleToUser("user1", "USER");
            userService.addRoleToUser("admin","USER");
            userService.addRoleToUser("admin","ADMIN");

            try{
                User user= userService.authenticate("user1","123456");
                System.out.println(user.getUserId());
                System.out.println(user.getUsername());
                user.getRoles().forEach(r->{
                    System.out.println("Role : "+r.toString());
                });
            }catch (Exception e){
                e.printStackTrace();
            }
        };
    }
}

package book.blog.authenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenServiceApplication.class, args);
        System.out.println("ok authen");
    }

}

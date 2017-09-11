package com.ex;

import com.ex.Dao.Userdao;
import com.ex.Objects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)
public class DemoApplication {

    @Autowired
    Userdao dao;

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

<<<<<<< HEAD
    @Bean
    public CommandLineRunner runner(){
        return args -> {
            User a = dao.findOne(1);
            System.out.println(a);
            User b = dao.findByUserName("Batman");
<<<<<<< HEAD

=======
            System.out.println(b);
>>>>>>> 47eac72db6b236f6124adb6cde7f0ad8110e7391
        };
    }
=======

>>>>>>> 90fb14cd4364ba89f937c871737cc588897a5ab0

    //Example mapping to the root
    @Controller
    public class HomeContoller {
        @RequestMapping("/")
        public String index() {
            return "something.html";
        }
    }

}

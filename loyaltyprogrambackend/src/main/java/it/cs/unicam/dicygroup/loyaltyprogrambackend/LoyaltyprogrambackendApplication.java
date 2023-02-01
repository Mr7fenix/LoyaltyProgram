package it.cs.unicam.dicygroup.loyaltyprogrambackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LoyaltyprogrambackendApplication {

    @GetMapping("/")
    String home() {
        return "Questo è il programma per gestire vari programmi fedeltà. Il progetto è del gruppo DicyGroup e si trova su GitHub al link: https://github.com/Mr7fenix/LoyaltyProgram";
    }


    public static void main(String[] args) {
        SpringApplication.run(LoyaltyprogrambackendApplication.class, args);
    }


}

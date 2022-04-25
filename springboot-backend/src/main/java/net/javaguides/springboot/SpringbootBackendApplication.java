package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("17/04/2022","Marcio Botelho", "R$ 25,72", "Debito" ));
        this.userRepository.save(new User("18/04/2022","Jurandir Rodrigues", "R$ 152.40", "Pix"));
        this.userRepository.save(new User("21/04/2022","Marina Souza", "R$ 101,25", "Credito"));
        this.userRepository.save(new User("23/04/2022", "Jorge Amaral", "R$ 101,25", "Credito"));
    }
}
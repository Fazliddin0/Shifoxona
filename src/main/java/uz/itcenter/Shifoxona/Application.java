package uz.itcenter.Shifoxona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.itcenter.Shifoxona.entity.Lavozim;
import uz.itcenter.Shifoxona.entity.User;
import uz.itcenter.Shifoxona.repasitory.UserRepository;


import java.util.Optional;
import java.util.Set;


    @SpringBootApplication
    public class  Application implements ApplicationRunner {

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }

        @Autowired
        PasswordEncoder passwordEncoder;

        @Autowired
        UserRepository userRepository;

        @Override
        public void run(ApplicationArguments args) throws Exception {
            Optional<User> user = userRepository.findByLogin("admin123");
            if (!user.isPresent()) {
                User u = new User();
                u.setIsm("admin");
                u.setFamiliya("Admin");
                u.setLogin("admin123");
                u.setParol(passwordEncoder.encode("admin123"));
                u.setAktiv(true);
                u.setLavozimlar(Set.of(Lavozim.ADMIN));
                userRepository.save(u);
            }
        }
    }



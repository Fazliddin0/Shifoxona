package uz.itcenter.Shifoxona.security;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uz.itcenter.Shifoxona.entity.User;
import uz.itcenter.Shifoxona.repasitory.UserRepository;

import java.util.Optional;

@Service
    public class UserProvider implements UserDetailsService {

        @Autowired
        UserRepository userRepository;
        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Optional<User> user =  userRepository.findByLogin(username);
            if(user.isPresent()) {

                return new UserMaxsus(user.get());
            }


            throw new UsernameNotFoundException(username);
        }
}
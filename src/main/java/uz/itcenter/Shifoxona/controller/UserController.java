package uz.itcenter.Shifoxona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.itcenter.Shifoxona.Service.impl.UserService;
import uz.itcenter.Shifoxona.security.JWTFilter;
import uz.itcenter.Shifoxona.security.JwtTokenUtil;
import uz.itcenter.Shifoxona.security.UserMaxsus;
import uz.itcenter.Shifoxona.security.UserProvider;

@RestController
@RequestMapping("/api/user")
public class UserController {

        @Autowired
        UserProvider userProvider;


        @Autowired
        private AuthenticationManager authenticationManager;



        @Autowired
        private UserService userService;

        @Autowired
        private JWTFilter jwtFilter;

         @Autowired
         private JwtTokenUtil jwtTokenUtil;


    @PostMapping("/authinticate")
        public ResponseEntity<String> login(@RequestBody UserMaxsus userMaxsus) throws Exception {
            try {
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                        userMaxsus.getUsername(), userMaxsus.getPassword()));
            } catch (DisabledException e) {
                throw new Exception("USER_DISABLED", e);
            } catch (BadCredentialsException e) {
                throw new Exception("INVALID_CREDENTIALS", e);
            } catch (Exception ex){
                ex.printStackTrace();
            }

            UserDetails userDetails = userProvider.loadUserByUsername(userMaxsus.getUsername());

            String token = jwtTokenUtil.generateToken(userDetails, true);

            return ResponseEntity.ok(token);

        }
    }



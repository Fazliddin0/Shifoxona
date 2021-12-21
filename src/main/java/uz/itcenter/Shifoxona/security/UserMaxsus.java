package uz.itcenter.Shifoxona.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import uz.itcenter.Shifoxona.entity.User;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class UserMaxsus implements UserDetails {

    private String login;
    private String parol;
    private Set<SimpleGrantedAuthority> lavozimlar;
    private Boolean aktiv;

    public UserMaxsus() {
    }

    public UserMaxsus(User user) {
        this.login = user.getLogin();
        this.parol = user.getParol();

        this.lavozimlar =
                user.getLavozimlar()
                        .stream()
                        .map(l -> new SimpleGrantedAuthority(l.name()))
                        .collect(Collectors.toSet());
        this.aktiv = user.getAktiv();
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return lavozimlar;
    }

    @Override
    public String getPassword() {
        return parol;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return aktiv;
    }
    }



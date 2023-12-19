package ru.netology.jclo422.repository;

import org.springframework.stereotype.Repository;
import ru.netology.jclo422.model.Authorities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private final Map<String, List<Authorities>> userAuthorities = new HashMap<>();

    public UserRepository() {
        userAuthorities.put("Ivan_AAA", List.of(Authorities.READ));
        userAuthorities.put("Oleg_BBB", List.of(Authorities.READ));
        userAuthorities.put("Igor_CCC", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE));
    }
    public List<Authorities> getUserAuthorities(String user, String password) {
        return userAuthorities.get(user + "_" + password);
    }
}
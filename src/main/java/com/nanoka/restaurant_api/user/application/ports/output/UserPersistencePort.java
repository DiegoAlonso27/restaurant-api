package com.nanoka.restaurant_api.user.application.ports.output;

import java.util.List;
import java.util.Optional;

import com.nanoka.restaurant_api.user.domain.model.User;

public interface UserPersistencePort {
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    Optional<User> findByDocumentNumber(String documentNumber);
    Optional<User> findByEmail(String email);
    List<User> findAll();
    User save(User user);
    void deleteById(Long id);
}

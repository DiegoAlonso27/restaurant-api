package com.nanoka.restaurant_api.user.application.ports.input;

import java.util.List;

import com.nanoka.restaurant_api.user.domain.model.User;

public interface UserServicePort {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll();
    User save(User user);
    User update(Long id, User user);
    void delete(Long id);
    void changePassword(String username,String currentPassword, String newPassword);
    void toggleEnabled(Long id, Boolean isEnabled);
    void changePasswordByEmail(String email, String code, String newPassword);
}

package com.nanoka.restaurant_api.user.infrastructure.adapters.output.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanoka.restaurant_api.user.infrastructure.adapters.output.persistence.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);

    Optional<UserEntity> findByDocumentNumber(String documentNumber);

    Optional<UserEntity> findByEmail(String email);
}

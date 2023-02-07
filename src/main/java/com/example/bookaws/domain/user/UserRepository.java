package com.example.bookaws.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    public Optional<Users> findByEmail(String email);

}

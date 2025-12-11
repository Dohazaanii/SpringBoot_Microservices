package com.tp.gestion_vente.repository;

import com.tp.gestion_vente.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository  extends JpaRepository<Users, Long> {
    Users findByLoginAndPass(String login, String pass);
}

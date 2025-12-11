package com.tp.gestion_vente.repository;

import com.tp.gestion_vente.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository  extends JpaRepository<Users, Long> {
    public Users findByLoginAndPass(String login, String pass);
}

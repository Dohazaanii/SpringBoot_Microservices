package com.tp.gestion_vente.service;

import com.tp.gestion_vente.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;

    public boolean VerifyUsers(String login, String pass) {
        return (usersRepository.findByLoginAndPass(login, pass) != null);
}
}

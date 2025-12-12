package com.tp.gestion_commercial.repository;

import com.tp.gestion_commercial.entity.TousCommandes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TousCommandesRepository extends JpaRepository<TousCommandes, String> {
}

package com.tp.gestion_commercial.controller;

import com.tp.gestion_commercial.entity.ProduitsPrix;
import com.tp.gestion_commercial.entity.TousCommandes;
import com.tp.gestion_commercial.repository.ProduitsPrixRepository;
import com.tp.gestion_commercial.repository.TousCommandesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CommercialController {

    @Autowired
    private ProduitsPrixRepository produitsPrixRepository;

    @Autowired
    private TousCommandesRepository tousCommandesRepository;


    @GetMapping("/produits")
    public List<ProduitsPrix> getProduits() {
        return produitsPrixRepository.findAll();
    }


    @PostMapping("/tous-commandes")
    public TousCommandes ajouterCommande(@RequestBody TousCommandes commande) {
        return tousCommandesRepository.save(commande);
    }
}

package com.tp.gestion_stock.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Produits_Stock")
public class ProduitStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeStock;
    private Integer codePdt;
    private Integer qtePdt;


}
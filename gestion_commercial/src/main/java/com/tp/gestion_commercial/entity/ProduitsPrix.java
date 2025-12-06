package com.tp.gestion_commercial.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Produits_Prix")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitsPrix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codePdt;

    private String nomPdt;
    private String descPdt;
    private double prixPdt;
}

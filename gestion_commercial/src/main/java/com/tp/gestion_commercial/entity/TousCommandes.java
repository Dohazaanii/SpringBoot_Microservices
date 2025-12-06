package com.tp.gestion_commercial.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Tous_commandes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TousCommandes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeTousCmd;

    private Long codeCmd;
    private String client;
    private Long codePdt;
    private int qteCmd;
    private String dateCmd;
}

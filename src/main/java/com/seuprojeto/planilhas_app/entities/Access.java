package com.seuprojeto.planilhas_app.entities;

import com.seuprojeto.planilhas_app.enuns.TypeAccess;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Access {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User userAccess;

    @ManyToOne
    private Spreadsheet spreadsheet;
    private TypeAccess typeAccess;
}

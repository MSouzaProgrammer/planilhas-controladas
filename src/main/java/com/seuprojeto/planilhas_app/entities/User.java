package com.seuprojeto.planilhas_app.entities;

import java.util.List;

import com.seuprojeto.planilhas_app.enuns.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    private Role role;

    @OneToMany(mappedBy = "owner")
    private List<Spreadsheet> spreadsheets;

    @OneToMany(mappedBy = "UserAccess")
    private List<Access> accesses;
}

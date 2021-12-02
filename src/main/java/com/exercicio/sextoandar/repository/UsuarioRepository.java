package com.exercicio.sextoandar.repository;

import com.exercicio.sextoandar.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
}
